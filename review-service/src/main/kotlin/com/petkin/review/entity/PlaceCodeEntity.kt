import jakarta.persistence.*

@Entity
@Table(name = "PLACE_CODE")
data class PlaceCode(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "PLACE_DETAIL_IDX")
        val placeDetailIdx: Long
) {
        constructor() : this(0)
}