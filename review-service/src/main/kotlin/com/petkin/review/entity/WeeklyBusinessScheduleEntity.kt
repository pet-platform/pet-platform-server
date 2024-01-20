import jakarta.persistence.*

@Entity
@Table(name = "WEEKLY_BUSINESS_SCHEDULE")
data class WeeklyBusinessSchedule(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "PLACE_IDX")
        val placeIdx: Long,

        @Column(name = "DAY")
        val day: String,

        @Column(name = "OPEN_TIME")
        val openTime: java.time.LocalDateTime,

        @Column(name = "CLOSE_TIME")
        val closeTime: java.time.LocalDateTime,
) {
        constructor() : this(0, "", java.time.LocalDateTime.now(), java.time.LocalDateTime.now())

}

