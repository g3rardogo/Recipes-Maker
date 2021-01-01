package model

class Verdura(): Receta() {
    val menu = listOf<String>("Zanahorias", "Brocoli", "Tomate", "Calabacin", "Lechuga", "Patata", "Berenjena")
    val receta = Receta()

    fun main(){
        receta.showMenu(menu)
    }
}