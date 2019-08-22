package id.smkn4.smkcoding.footballscoring

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Classment (
    @PrimaryKey(autoGenerate = true)
    val id_classment: Int? = null,
    val id_league: Int,
    val id_team: Int,
    val team_point: Int
)