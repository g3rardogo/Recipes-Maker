package model

open class Product(var name: String, var cantidad: Int) {

    open fun create(): String{
        return "Producto agregado a la receta"
    }
}