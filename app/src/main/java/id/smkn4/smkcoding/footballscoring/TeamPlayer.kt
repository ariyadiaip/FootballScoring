package id.smkn4.smkcoding.footballscoring

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class TeamPlayer (
    @PrimaryKey(autoGenerate = true)
    val id_teamPlayer: Int? = null,
    val id_team: Int,
    val player_name: String,
    val position: String
)