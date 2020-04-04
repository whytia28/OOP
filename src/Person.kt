open class Person(var name : String, var alamat: String, var usia: Int) {

    open fun cetakPerson(){
        println("$name bertempat tinggal di $alamat, usianya $usia")
    }
    protected fun cekFun(){
        println("This is protected")
    }
}