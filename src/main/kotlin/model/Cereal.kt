package model

class Cereal(): Receta() {
    val menu = listOf<String>("Platanos", "Fresas", "Uvas", "Manzanas", "Pera", "Kiwi")
    val receta = Receta()

    fun main(){
        receta.showMenu(menu)
    }
}