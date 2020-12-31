package model

class Verdura(): Product() {
    val menu = listOf<String>("Zanahorias", "Brocoli", "Tomate", "Calabacin", "Lechuga", "Patata", "Berenjena")
    val receta = Receta()

    fun main(){
        receta.showMenu(menu)
    }
}