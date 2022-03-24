fun hitungan(x : Int ){
    var fungsi = (2 * x * x) + (5 * x) - 8
    println(fungsi)
}
fun main(){
    print("Nilai X = ")
    var nilai = readLine()!!.toInt()
    hitungan(nilai)
}
