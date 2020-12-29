package model

class Agua(): Product(){

    override fun create(): String{
        return "Agua agregada a la receta"
    }
}