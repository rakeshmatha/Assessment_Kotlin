package com.usaa.assessment.interviewChallenge

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
@ComponentScan
class AssessmentApplication
fun main(args: Array<String>) {
	runApplication<AssessmentApplication>(*args)
}
