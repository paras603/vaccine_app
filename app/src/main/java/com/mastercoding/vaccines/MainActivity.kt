package com.mastercoding.vaccines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1. AdapterView: Recycler View
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,
            false
            )

        //2. Data source: list of vaccines
        var vaccinesList : ArrayList<VaccineModel> = ArrayList()

        val v1 = VaccineModel("COVID-19",R.drawable.vaccine1)
        val v2 = VaccineModel("Hepatitis B",R.drawable.vaccine4)
        val v3 = VaccineModel("Tetanus Vaccine",R.drawable.vaccine5)
        val v4 = VaccineModel("Pneunmococal Vaccine",R.drawable.vaccine6)
        val v5 = VaccineModel("Rotavirus Vaccine",R.drawable.vaccine7)
        val v6 = VaccineModel("Measeals Vaccine",R.drawable.vaccine8)
        val v7 = VaccineModel("Chickenpox Vaccine",R.drawable.vaccine9)
        val v8 = VaccineModel("Aminocaocal Vaccine",R.drawable.vaccine1)
        val v9 = VaccineModel("Thesonicita Vaccine",R.drawable.vaccine5)

        vaccinesList.add(v1)
        vaccinesList.add(v2)
        vaccinesList.add(v3)
        vaccinesList.add(v4)
        vaccinesList.add(v5)
        vaccinesList.add(v6)
        vaccinesList.add(v7)
        vaccinesList.add(v8)
        vaccinesList.add(v9)

        //3.Adapter
        val adapter = MyAdapter(vaccinesList)
        recyclerView.adapter = adapter

    }
}