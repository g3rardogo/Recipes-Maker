package model

class Verdura(): Product() {
    override fun create(response: String){
        println("Verdura agregada a la receta")
    }

    fun menu(){
        println("Verduras:\n1.Zanahoria\n2.Brocoli\n3.Tomate\n4.Calabacin\n5.Lechuga\n6.Patata\n7.Berenjena")
    }
}