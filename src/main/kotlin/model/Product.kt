package model

class Product(var name: String, var cantidad: Int) {
    fun create(): String{
        return "Producto agregado a la receta"
    }
}