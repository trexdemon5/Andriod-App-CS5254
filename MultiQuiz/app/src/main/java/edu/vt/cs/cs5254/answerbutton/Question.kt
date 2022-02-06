package edu.vt.cs.cs5254.answerbutton

import androidx.annotation.StringRes

data class Question(
    @StringRes val textRedId: Int,
    val answerList: List<Answer>
)
