package com.usaa.assessment.interviewChallenge

import org.springframework.stereotype.Component

@Component
class InterviewService {

    fun getId(num: Int): String {
        var user = ""
        if (num == 1) user = "Java"
        if (num == 2) user ="Kotlin"
        else "Spring-Kotlin"
        return user
    }
}