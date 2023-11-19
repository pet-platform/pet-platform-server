package com.petkin.review.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "REVIEW")
data class Review(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "REVIEW_IDX")
        val reviewIdx: Long? = null,

        @Column(name = "MEMBER_IDX")
        val memberIdx: Long,

        @Column(name = "REVIEW_CONTENT")
        val reviewContent: String,

        @Column(name = "REGISTER_DATE")
        val registerDate: LocalDateTime,

        @Column(name = "UPDATE_DATE")
        val updateDate: LocalDateTime,

        @Column(name = "REPORT_FLAG")
        val reportFlag: Char,

        @Column(name = "DELETE_FLAG")
        val deleteFlag: Char
) {
        constructor() : this(null, 0, "", LocalDateTime.now(), LocalDateTime.now(), 'N', 'N')
}