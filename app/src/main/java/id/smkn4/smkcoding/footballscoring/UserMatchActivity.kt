package id.smkn4.smkcoding.footballscoring

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class UserMatchActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    private var listItem: ArrayList<Data>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_match)
        signFun()
        getAllUser()
        showRecyclerView()
    }

    private fun signFun() {
        recyclerView = findViewById(R.id.statsMatch)
        listItem = ArrayList()
    }

    private fun getAllUser() {
        listItem?.add(Data("Aip", "A",1,2))
        listItem?.add(Data("Ari", "B",2,11))
        listItem?.add(Data("Beben", "A",3,12))
    }

    private fun showRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = DataAdapter(this, listItem!!)
    }
}
