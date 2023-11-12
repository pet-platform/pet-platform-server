import jakarta.persistence.*

@Entity
@Table(name = "PLACE")
data class Place(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "PLACE_IDX")
        val placeIdx: Long? = null,

        @Column(name = "PLACE_NAME")
        val placeName: String = "",

        @Column(name = "LONGITUDE")
        val longitude: String = "",

        @Column(name = "LATITUDE")
        val latitude: String = "",

        @Column(name = "PLACE_PHONE_NUMBER")
        val placePhoneNumber: String? = null,

        @Column(name = "ADDRESS")
        val address: String = "",

        @Column(name = "SECTORS")
        val sectors: String = ""
)
