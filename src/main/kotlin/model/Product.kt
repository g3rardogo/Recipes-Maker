package model

open class Product(): Receta() {

    open fun create(response: String) {
        println("Producto agregado a la receta")
    }

}