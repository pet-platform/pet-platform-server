import jakarta.persistence.*

@Entity
@Table(name = "WEEKLY_BUSINESS_SCHEDULE")
data class WeeklyBusinessSchedule(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "WEEKLY_BUSINESS_SCHEDULE_IDX")
        val weeklyBusinessScheduleIdx: Long? = null,

        @Column(name = "DAY", nullable = false)
        val day: Char = ' ',

        @Column(name = "OPEN_TIME", nullable = false)
        val openTime: java.time.LocalDateTime,

        @Column(name = "CLOSE_TIME", nullable = false)
        val closeTime: java.time.LocalDateTime,

        @ManyToOne
        @JoinColumn(name = "PLACE_DETAIL_IDX", nullable = false)
        val placeDetail: PlaceDetail
)

