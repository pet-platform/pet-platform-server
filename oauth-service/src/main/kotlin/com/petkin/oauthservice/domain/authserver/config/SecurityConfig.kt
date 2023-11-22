package com.petkin.oauthservice.domain.authserver.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.http.MediaType
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.oauth2.core.AuthorizationGrantType
import org.springframework.security.oauth2.core.ClientAuthenticationMethod
import org.springframework.security.oauth2.core.oidc.OidcScopes
import org.springframework.security.oauth2.server.authorization.client.InMemoryRegisteredClientRepository
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository
import org.springframework.security.oauth2.server.authorization.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration
import org.springframework.security.oauth2.server.authorization.config.annotation.web.configurers.OAuth2AuthorizationServerConfigurer
import org.springframework.security.oauth2.server.authorization.settings.ClientSettings
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint
import org.springframework.security.web.util.matcher.MediaTypeRequestMatcher
import java.security.KeyPair
import java.security.KeyPairGenerator
import java.util.*

@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    @Order(1)
    fun authorizationServerSecurityFilterChain(httpSecurity: HttpSecurity): SecurityFilterChain {

        OAuth2AuthorizationServerConfiguration.applyDefaultSecurity(httpSecurity)
        httpSecurity
            .getConfigurer((OAuth2AuthorizationServerConfigurer::class).java)
            .oidc(Customizer.withDefaults())
        httpSecurity
            .exceptionHandling { exceptions ->
                exceptions.defaultAuthenticationEntryPointFor(
                    LoginUrlAuthenticationEntryPoint("/login"),
                    MediaTypeRequestMatcher(MediaType.TEXT_HTML)
                )
            }
            .oauth2ResourceServer {
                resourceServer -> resourceServer.jwt(Customizer.withDefaults())
            }

        return httpSecurity.build()
    }

    @Bean
    @Order(2)
    fun defaultSecurityFilterChain(httpSecurity: HttpSecurity) : SecurityFilterChain {

        httpSecurity
            .authorizeHttpRequests {
                authorize -> authorize
                    .anyRequest()
                    .authenticated()
            }
            .formLogin(Customizer.withDefaults())

        return httpSecurity.build()
    }

    @Bean
    fun userDetailService() : UserDetailsService {

        val userDetails = User.withUsername("user")
            .password("{bcrypt}$2a$10${'$'}dXJ3SW6G7P50lGmMkkmwe.20cQQubK3.HZWzG3YB1tlRy.fqvM/BG")
            .roles("USER")
            .build()

        return InMemoryUserDetailsManager(userDetails)
    }

    @Bean
    fun registeredClientRepository() : RegisteredClientRepository {
        val oidcClient = RegisteredClient
            .withId(UUID.randomUUID().toString())
            .clientId("oidc-client")
            .clientSecret("{noop}secret")
            .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
            .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
            .authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN)
            .redirectUri("http://127.0.0.1/login/oauth2/code/oidc-client")
            .postLogoutRedirectUri("http://127.0.0.1/")
            .scope(OidcScopes.OPENID)
            .scope(OidcScopes.PROFILE)
            .clientSettings(
                ClientSettings.builder()
                    .requireAuthorizationConsent(true)
                    .build() )
            .build()

        return InMemoryRegisteredClientRepository(oidcClient)
    }

    companion object {
        @Bean
        fun generateRsaKey() : KeyPair {

            val keyPairGenerator = KeyPairGenerator.getInstance("RSA")
            keyPairGenerator.initialize(2048)

            return keyPairGenerator.generateKeyPair()
        }
    }
}