fun main(args: Array<String>){

    print("Input bilangan: ")
    var angka= readLine()!!.toInt()
    var hasil = angka;
    repeat(7){
        angka += hasil;

        if(angka % 2 == 0 || angka % 3 == 0) {
            print("$angka ");
        }
    }

}





