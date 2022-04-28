package com.example.otomotif.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Sepeda motor adalah alat transportasi terbanyak yang dipakai di Indonesia dibandingkan jenis kendaraan lainnya. Susunan kendaraan ini terdiri dari roda, bingkai, poros serta tangki bahan bakar yang digerakkan mesin bermotor.\n" +
                "\n" +
                "Kendaraan roda dua punya banyak bagian yang fungsinya berbeda-beda. Berikut adalah beberapa komponen utama dari mesin tersebut:  Cylinder Head Motor, Bak Engkol Mesin atau Crankcase, lok Silinder atau Cylinder Block"
    }
    val text: LiveData<String> = _text
}