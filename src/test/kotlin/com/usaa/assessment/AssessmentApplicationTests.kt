package com.usaa.assessment

import com.usaa.assessment.interviewChallenge.Challenge
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration
class AssessmentApplicationTests {

	@Autowired
	lateinit var mockMvc: MockMvc
	@Test
	fun `should return the interview result as string`() {
		mockMvc.get("/interviews/interviewId")
			.andDo { print() }
			.andExpect {
				status { isOk() }
				content { contentType(MediaType.APPLICATION_JSON) }
				jsonPath("$[3]"){value(1234)}
			}

	}
}
