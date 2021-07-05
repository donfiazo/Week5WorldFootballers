package com.eddie.worldfootballers.adapter


import androidx.recyclerview.widget.RecyclerView
import com.eddie.worldfootballers.databinding.FootballersListBinding
import com.eddie.worldfootballers.models.Footballer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eddie.worldfootballers.models.onItemClickListener

class FootballersAdapter (val footballers: List<Footballer>,
                        private val listener: onItemClickListener
                          ) : RecyclerView.Adapter<FootballersAdapter.FootballerViewHolder> (){


  inner  class FootballerViewHolder (val binding: FootballersListBinding) : RecyclerView.ViewHolder(binding.root),
    View.OnClickListener{

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position: Int = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClick(position)
            }
        }

        fun bind(footballer: Footballer){
            binding.playerPhoto.setImageResource(footballer.player_photo)
            binding.firstName.text = footballer.firstname
            binding.lastName.text = footballer.lastname
            binding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FootballerViewHolder {
        var binding = FootballersListBinding.inflate(LayoutInflater.from(parent.context))
        return FootballerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FootballerViewHolder, position: Int) {
        val footballer = footballers [position]
        holder.bind(footballer)
    }

    override fun getItemCount(): Int {
        return footballers.size
    }
}

