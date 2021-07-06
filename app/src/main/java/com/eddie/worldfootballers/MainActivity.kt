package com.eddie.worldfootballers

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.eddie.worldfootballers.adapter.FootballersAdapter
import com.eddie.worldfootballers.databinding.ActivityRecyclerViewBinding
import com.eddie.worldfootballers.databinding.FootballersListBinding
import com.eddie.worldfootballers.models.Footballer
import com.eddie.worldfootballers.models.onItemClickListener

class MainActivity : AppCompatActivity(), onItemClickListener{

    private lateinit var binding: ActivityRecyclerViewBinding
    private lateinit var myFootballersAdapter: FootballersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val footballers: List<Footballer> = listOf(

            Footballer(R.drawable.alexander_arnold, "Alexander", "Arnold"),
            Footballer(R.drawable.claudio_marchisio, "Claudio", "Marchisio"),
            Footballer(R.drawable.angel_maria, "Angel", "Di Maria"),
            Footballer(R.drawable.cristiano_ronaldo,"Cristiano", "Ronaldo"),
            Footballer(R.drawable.dani_alves, "Dani", "Alves"),
            Footballer(R.drawable.diego_maradona, "Diego", "Maradona"),
            Footballer(R.drawable.franck_ribery, "Franck", "Ribery"),
            Footballer(R.drawable.gareth_bale, "Gareth", "Bale"),
            Footballer(R.drawable.gerard_pique, "Gerard", "Pique"),
            Footballer(R.drawable.juan_mata, "Juan", "Mata"),
            Footballer(R.drawable.kazuyoshi_miura, "Kazuyoshi", "Miura"),
            Footballer(R.drawable.kevin_debruyne, "Kevin", "De Bruyne"),
            Footballer(R.drawable.kylian_mbape, "Kylian", "Mbape"),
            Footballer(R.drawable.luis_suarez, "Luis", "Suarez"),
            Footballer(R.drawable.manuel_neuer, "Manuel", "Neuer"),
            Footballer(R.drawable.xabi_alonso, "Xabi", "Alonso"),
            Footballer(R.drawable.zinedine_zidane, "Zinedine", "Zidane"),
            Footballer(R.drawable.batistuta, "Gabriel", "Batistuta"),
            Footballer(R.drawable.pele, "Santos","Pele")
        )
        myFootballersAdapter = FootballersAdapter(footballers, this)
        binding.footballerRecyclerView.adapter = myFootballersAdapter
    }

    override fun onItemClick(position: Int) {
        val intent = Intent(this@MainActivity,ProfileActivity::class.java)


    // Toast.makeText(this, "Item $position clicked", Toast.LENGTH_SHORT).show()
    }

    }
