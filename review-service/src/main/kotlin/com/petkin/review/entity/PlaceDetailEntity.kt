import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "PLACE")
data class PlaceDetail(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "PLACE_DETAIL_IDX")
        val placeDetailIdx: Long? = null,

        @Column(name = "PLACE_IDX")
        val placeIdx: Long = 0,

        @Column(name = "HIT")
        val hit: Int = 0,

        @Column(name = "PLACE_CATEGORY")
        val placeCategory: Char = ' '
) : TemporalInfo() {
        constructor() : this(null, 0, ' ')
}