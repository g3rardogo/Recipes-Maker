package model

class Leche(): Product() {
    val menu = listOf<String>("Leche desnatada", "Leche entera")
    val receta = Receta()

    fun main(){
        receta.showMenu(menu)
    }
}