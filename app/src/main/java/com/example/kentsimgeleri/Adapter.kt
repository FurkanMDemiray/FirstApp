package com.example.kentsimgeleri

// import reclyview class from androidx library
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kentsimgeleri.databinding.RecyclerRowBinding


class Adapter(val landMarkList: ArrayList<LandMark>) : RecyclerView.Adapter<Adapter.Holder>() {

    class Holder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        //holder.binding.recyclerImageView.setImageResource(landMarkList.get(position).image)
        holder.binding.recyclerTextView.text = landMarkList.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("landMark", landMarkList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return landMarkList.size
    }


}

