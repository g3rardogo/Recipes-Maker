package model

class Fruta(): Product() {
    override fun create(response: String) {
        println("Fruta agregada a la receta")
    }

    fun menu(){
        println("Frutas:\n1.Fresa\n2.Platano\n3.Uvas\n4.Manzanas\n5.Naranja\n6.Pera\n7.Cereza")
    }
}