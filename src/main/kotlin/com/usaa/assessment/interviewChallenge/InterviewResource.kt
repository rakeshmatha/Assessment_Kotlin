package com.usaa.assessment.interviewChallenge

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@Component
@RestController
@EnableWebMvc
@RequestMapping("/")
class InterviewResource {

    @Autowired
    lateinit var service:InterviewService

    @GetMapping("/{interviewId}")
    fun getInterviews(@PathVariable interviewId: Int): String {
        return service.getId(interviewId);
    }
}
