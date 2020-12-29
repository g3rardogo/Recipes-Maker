package model

class Carne(): Product() {
    override fun create(): String {
        return "Carne agregada a la receta"
    }

}