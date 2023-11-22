package com.petkin.oauthservice.domain.authserver.config


import com.nimbusds.jose.jwk.JWKSet
import com.nimbusds.jose.jwk.RSAKey
import com.nimbusds.jose.jwk.source.ImmutableJWKSet
import com.nimbusds.jose.jwk.source.JWKSource
import com.nimbusds.jose.proc.SecurityContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.oauth2.jwt.JwtDecoder
import org.springframework.security.oauth2.server.authorization.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration
import org.springframework.security.oauth2.server.authorization.settings.AuthorizationServerSettings
import java.security.interfaces.RSAPrivateKey
import java.security.interfaces.RSAPublicKey


@Configuration
class AuthTokenConfig {
    @Bean
    fun jwkSource() : JWKSource<SecurityContext> {

        val keyPair = SecurityConfig.generateRsaKey()
        val rsaPublicKey : RSAPublicKey? = keyPair.public as RSAPublicKey?
        val rsaPrivateKey : RSAPrivateKey? = keyPair.private as RSAPrivateKey?

        return ImmutableJWKSet(
            JWKSet(
                RSAKey.Builder(rsaPublicKey)
                    .privateKey(rsaPrivateKey)
                    .build()
            )
        )
    }

    @Bean
    fun jwtDecoder(jwkSource: JWKSource<SecurityContext>) : JwtDecoder {
        return OAuth2AuthorizationServerConfiguration
            .jwtDecoder(jwkSource)
    }

    @Bean
    fun authorizationServerSettings() : AuthorizationServerSettings {
        return AuthorizationServerSettings
            .builder()
            .build()
    }
}