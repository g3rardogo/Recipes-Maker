package model

class Agua(name: String, cantidad: Int): Product(name, cantidad){

    override fun create(): String{
        return "Agua agregada a la receta"
    }
}