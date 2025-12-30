package com.example.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello Blaszak's World!"
    }

    @PostMapping("/hello")
    fun helloPost(@RequestBody name: String): String {
        return "Hello $name!"
    }
}
