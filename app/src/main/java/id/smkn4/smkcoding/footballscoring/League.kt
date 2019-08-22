package id.smkn4.smkcoding.footballscoring

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class League (
    @PrimaryKey(autoGenerate = true)
    val id_league: Int? = null,
    val league_name: String
)