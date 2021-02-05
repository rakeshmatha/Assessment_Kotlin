# Assessment_Kotlin
Kotlin Refactoring Assessment


In the following exercises, please write ALL code in Kotlin. You are welcome to utilize any resources that you would normally access on the job. Including, but not limited to Google, Stack Overflow, Kotlin sites, books, other reference material. While you may ask others for guidance, please do not have others perform the tasks for you. If anything is unclear or if you have questions about the intent of anything, please feel free to make any assumptions you wish, but note all assumptions you make.

1) Convert the following class to Kotlin:

/*
 * Copyright (C) 2021
 * United Services Automobile Association
 * All Rights Reserved.
 */
package com.usaa.pnc.mobile.interview;

public class Challenge {
    private String question;
    private String answer;
    private boolean correct;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}

2) Using the Kotlin version you wrote of the class above (Challenge) as needed, convert the following class to Kotlin:

/*
 * Copyright (C) 2021
 * United Services Automobile Association
 * All Rights Reserved.
 */
package com.usaa.pnc.mobile.interview;

import java.util.ArrayList;
import java.util.List;

public class Interview {
    public static final double PASSING_SCORE = 0.835;

    private List<Challenge> challenges = new ArrayList<>();

    public void setChallenges(List<Challenge> challenges) {
        this.challenges = challenges;
    }

    public void addChallenge(Challenge challenge) {
        if (challenge != null) {
            if (challenges == null) {
                challenges = new ArrayList<>();
            }

            challenges.add(challenge);
        }
    }

    public Double getScore() {
        Double score = null;

        if (challenges != null) {
            double total = 0;

            for(Challenge challenge : challenges) {
                total += challenge.isCorrect() ? 1 : 0;
            }

            score = total / challenges.size();
        }

        return score;
    }

    public boolean isPassing() {
        return getScore() >= PASSING_SCORE;
    }
}

3) Write tests for the code you have written so far (Challenge & Interview). Feel free to use any testing libraries with which you are familiar.

4) Convert the following class to Kotlin and Spring Boot:

/*
 * Copyright (C) 2021
 * United Services Automobile Association
 * All Rights Reserved.
 */
package com.usaa.pnc.mobile.interview;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response

@Path("/interviews")
public class InterviewResource {

    @Inject
    private InterviewService service;
    
    @Path("/{interviewId}")
    @GET
    public Response getInterviews(@PathParam("interviewId") String interviewId) {
        return Response.ok(service.getInterviews(interviewId)).build();
    }
}



