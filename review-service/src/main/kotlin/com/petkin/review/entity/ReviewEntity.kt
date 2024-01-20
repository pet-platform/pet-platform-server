package com.petkin.review.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "REVIEW")
data class Review(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "REVIEW_IDX")
        val reviewIdx: Long,

        @Column(name = "MEMBER_IDX")
        val memberIdx: Long,

        @Column(name = "PLACE_IDX")
        val placeIdx: Long,

        @Column(name = "REVIEW_CONTENT")
        val reviewContent: String,

        @Column(name = "REPORT_FLAG")
        val reportFlag: Char,

        @Column(name = "DELETE_FLAG")
        val deleteFlag: Char
) {
        constructor() : this(0, 0, 0,"", 'N', 'N')
}