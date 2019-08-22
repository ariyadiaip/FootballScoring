package id.smkn4.smkcoding.footballscoring

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query;

@Dao
interface TeamDao {
    @Query("SELECT * FROM team")
    fun getAll(): List<Team>

    @Query("SELECT * FROM team WHERE id_team IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Team>

    @Query("SELECT * FROM team WHERE team_name LIKE :tname  LIMIT 1")
    fun findByName(tname: String): Team

    @Insert
    fun insertAll(vararg users: Team)

    @Delete
    fun delete(user: Team)
}
