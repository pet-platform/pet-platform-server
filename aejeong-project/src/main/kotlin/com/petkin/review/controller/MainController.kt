package com.petkin.review.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
internal class MainController {
    @GetMapping("/")
    fun welcome() = "index.html"
}