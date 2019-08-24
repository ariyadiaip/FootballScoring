package id.smkn4.smkcoding.footballscoring

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import org.jetbrains.anko.toast

class DataAdapter(private val context: Context, private val data: ArrayList<Data>) :
    RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        private val textViewTimeA: TextView = itemView.findViewById(R.id.timeEventA)
        private val textViewTimeB: TextView = itemView.findViewById(R.id.timeEventB)
        private val textViewNameA: TextView = itemView.findViewById(R.id.namePlayerA)
        private val textViewNameB: TextView = itemView.findViewById(R.id.namePlayerB)
        private val imageEvent: ImageView = itemView.findViewById(R.id.iconEvent)
        var pics = arrayOf(R.drawable.ball, R.drawable.yellow_card, R.drawable.red_card)
        private var codeTeam: String = ""
        fun bindItem(data: Data){
            textViewNameA.text = data.namePlayer
            textViewTimeA.text = data.minutes.toString() + "'"
            textViewNameB.text = data.namePlayer
            textViewTimeB.text = data.minutes.toString() + "'"
            imageEvent.setImageResource(pics[data.type-1])
            codeTeam = data.teamCode
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.custom_recview_user, parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(data[position])
        holder.itemView.setOnClickListener {
            context.toast(data[position].namePlayer + " Clicked")
        }
    }

}