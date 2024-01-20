import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "PLACE_DETAIL")
data class PlaceDetail(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "PLACE_DETAIL_IDX")
        val placeDetailIdx: Long,

        @Column(name = "PLACE_IDX")
        val placeIdx: Long,

        @Column(name = "HIT")
        val hit: Int,

        @Column(name = "PLACE_CATEGORY")
        val placeCategory: String
) : TemporalInfo() {
        constructor() : this(0, 0, 0,"")
}