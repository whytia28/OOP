class Manusia(private var nama : String? = "", var jenisKelamin : String? = "", private var alamat : String?="") {
    private var usia : Int = 0
    init {
    }
    constructor(nama: String, jenisKelamin: String?, alamat:String?, usia:Int) :
            this(nama,jenisKelamin,alamat){
        this.usia = usia
    }
    fun setUsia(newUsia : Int){
        usia = newUsia
    }
    fun setNama(newNama : String){
        nama = newNama
    }
    fun getNama() : String?{
        return nama
    }
    fun getUsia() : Int{
        return usia
    }

    fun cetakManusia(){
        println("$nama merupakan seorang $jenisKelamin yang berusia $usia dan tinggal di $alamat")
    }

}

