package zulfa.binar.chapterempat.ketiga.tugas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_aplikasi.view.*
import zulfa.binar.chapterempat.R
import java.util.ArrayList

class AdapterApp(val listdata : ArrayList<DataAplikasi>):RecyclerView.Adapter<AdapterApp.ViewHolder>() {

    class ViewHolder (layout: View): RecyclerView.ViewHolder(layout){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterApp.ViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.item_aplikasi, parent, false)
        return ViewHolder(layout)
    }

    override fun onBindViewHolder(holder: AdapterApp.ViewHolder, position: Int) {
        holder.itemView.tv_nama.text = listdata[position].namaapp
        holder.itemView.tv_dev.text = listdata[position].dev
        holder.itemView.tv_kategori.text = listdata[position].kategori
        holder.itemView.tv_raiting.text = listdata[position].raiting
        holder.itemView.tv_size.text = listdata[position].size
        holder.itemView.tv_jumlahdownload.text = listdata[position].jmldownload
    }

    override fun getItemCount(): Int {
        return listdata.size
    }
}