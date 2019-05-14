package com.aldana.ejemplo14

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {
    var scoreTeamA = 0
    var scoreTeamB = 0

    val currentvalueTeamA: Int
        get() = scoreTeamA

    val currentvalueTeamB: Int
        get() = scoreTeamB

}