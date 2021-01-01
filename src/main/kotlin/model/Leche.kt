package model

class Leche(): Receta() {
    val menu = listOf<String>("Leche desnatada", "Leche entera")
    val receta = Receta()

    fun main(){
        receta.showMenu(menu)
    }
}