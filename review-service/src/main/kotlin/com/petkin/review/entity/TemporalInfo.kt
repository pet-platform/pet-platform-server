import jakarta.persistence.*
import java.time.LocalDateTime

@MappedSuperclass
abstract class TemporalInfo(
        @Column(name = "REGISTER_DATE")
        val registerDate: LocalDateTime,

        @Column(name = "UPDATE_DATE")
        val updateDate: LocalDateTime? = null
) {
        constructor() : this(LocalDateTime.now(), LocalDateTime.now())
}