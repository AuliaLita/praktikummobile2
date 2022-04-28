package com.example.otomotif.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Dari KBBI dijelaskan jika otomotif memiliki arti yang berkaitan dengan sesuatu yang berputar otomatis seperti motor dan lainnya. Pengertian otomotif ini diambil dari akar kata otomotif yakni Oto yang berarti sendiri dan Motif yang berarti alasan.\n" +
                "\n" +
                "Dari penjelasan ini dapat disimpulkan jika otomotif merupakan ilmu atau bidang yang membahas sistem kendaraan bermotor. Ini disebabkan karena kendaraan bermotor bisa berputar atau bergerak dengan sendirinya memakai tenaga yang dihasilkan motor."
    }
    val text: LiveData<String> = _text
}