class Cat : Animal(), Ianimal{
    override fun sound() {
        println("Suara kucing Meow meow")
    }
    //Overloading
    fun sound(nama : String){
        println("$nama bersuara mingggg")
    }

    override fun food() {
        println("MAkanan kucing adalah Iwak")
    }

}