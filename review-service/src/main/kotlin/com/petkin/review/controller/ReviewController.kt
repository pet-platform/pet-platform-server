package com.petkin.review.controller

import com.petkin.review.entity.Review
import com.petkin.review.repository.ReviewRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/reviews")
class ReviewController(private val reviewRepository: ReviewRepository) {

    // 모든 리뷰 조회
    @GetMapping
    fun getAllReviews(): List<Review> {
        return reviewRepository.findAll()
    }
}