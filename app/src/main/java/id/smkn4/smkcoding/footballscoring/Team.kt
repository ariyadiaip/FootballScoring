package id.smkn4.smkcoding.footballscoring

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Team (
    @PrimaryKey(autoGenerate = true)
    val id_team: Int? = null,
    val team_name: String,
    val coach: String
)