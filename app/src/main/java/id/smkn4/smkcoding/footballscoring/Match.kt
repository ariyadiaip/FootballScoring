package id.smkn4.smkcoding.footballscoring

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Match (
    @PrimaryKey(autoGenerate = true)
    val id_match: Int? = null,
    val id_classment: Int,
    val team_home: String,
    val team_away: String,
    val score_team_home: Int,
    val score_team_away: Int,
    val match_type: String
)