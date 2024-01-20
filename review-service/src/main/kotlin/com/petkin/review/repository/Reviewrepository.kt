package com.petkin.review.repository

import com.petkin.review.entity.Review
import org.springframework.data.jpa.repository.JpaRepository

interface ReviewRepository : JpaRepository<Review, Long> {

    // 모든 리뷰를 조회하는 메서드
    override fun findAll(): List<Review>
}