import jakarta.persistence.*

@Entity
@Table(name = "CODE")
data class Code(
        @Id
        @Column(name = "CODE_NAME", length = 50, nullable = false)
        val codeName: String = "",

        @Column(name = "DESCRIPTION", length = 255)
        val description: String? = null
)