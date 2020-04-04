class Main {
    companion object{
        @JvmStatic
        fun main(args : Array<String>){
            val name = "binar"
            println(name.toUpperCase())
            val manusia = Manusia("Wahyu", "Laki-laki", "Depok")
            val manusiaBaru = Manusia("Sinta", "Perempuan", "Ngawi", 28)
            manusia.setUsia(20)
            manusia.cetakManusia()
            manusiaBaru.cetakManusia()
            manusia.setNama("Dita")
            manusia.jenisKelamin= "Perempuan"
            manusia.cetakManusia()
            println("${manusia.getNama()} usia ${manusia.getUsia()} jenis kelamin ${manusia.jenisKelamin}")


            val dosen = Dosen("D001", "Wahyu", "Depok", 28)
            dosen.cetakPerson()
            dosen.name
            dosen.alamat
            dosen.usia

            val animal = Animal()
            animal.sound()
            val cat = Cat()
            cat.sound()
            cat.food()
            cat.sound("James")
            val dog = Dog()
            dog.sound()
            val iron = Iron("Joni")
            iron.check()

        }
    }
}