package com.example.otomotif.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = " Mobil merupakan salah satu kendaraan yang didorong output daya roda empat atau bahkan lebih. Biasanya untuk menghidupan mesin akan dipakai bahan bakar cair seperti diesel atau bensin.\n" +
                "\n" +
                "Istilah ini diambil dari kependekan Automobile turunan dari kata Autos dalam bahasa Yunani serta Movere yang berarti mobil atau penggeral dari istilah Amerika. Berikut adalah beberapa komponen utama dan pendukung dari otomotif mobil: Blok Silinder Mobil, Kepala Silinder Mobil, Piston atau Torak, Poros Engkol atau Crank Shaft serta Piston Ring"
    }
    val text: LiveData<String> = _text
}