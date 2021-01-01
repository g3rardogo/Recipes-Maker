package model
import model.*

open class Aceite(): Receta(){
    val menu = listOf<String>("Aceite de girasol", "Aceite de oliva", "Aceite de coco", "Aceite de palma")
    val receta = Receta()

    fun main(){
        receta.showMenu(menu)
    }
}