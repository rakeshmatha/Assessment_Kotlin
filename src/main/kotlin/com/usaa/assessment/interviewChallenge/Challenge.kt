package com.usaa.assessment.interviewChallenge

import kotlin.collections.ArrayList

class Challenge {
    var question: String? = null
    var answer: String? = null
    var isCorrect = false

    companion object {const val PASSING_SCORE = 0.835}
    private operator fun Double.plusAssign(any: Any) {}

    inner class Interview {
        private var challenges: ArrayList<Challenge>? = ArrayList()

        fun setChallenges(challenges: ArrayList<Challenge>?) {
            this.challenges = challenges
        }

        fun addChallenge(challenge: Challenge?) {
            if (challenge != null) {
                if (challenges == null) {
                    challenges = ArrayList()
                }
                challenges!!.add(challenge)
            }
        }

        private val score: Double
            get() {
                var score: Double?
                var total = 0.0
                for (challenge in this.challenges!!) {
                    total += if (challenge.isCorrect) 1 else 0.toDouble()
                }
                score = total / challenges!!.size
                return score
            }

        val isPassing: Boolean
            get() = score >= PASSING_SCORE
    }
}