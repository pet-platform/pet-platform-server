import jakarta.persistence.*

@Entity
@Table(name = "CODE")
data class Code(
        @Id
        @Column(name = "CODE")
        val code: String,

        @Column(name = "CODE_NAME")
        val codeName: String
) {
        constructor() : this("","")
}