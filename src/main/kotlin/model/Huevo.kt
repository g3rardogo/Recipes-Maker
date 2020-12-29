package model

class Huevo(): Product() {
    override fun create(): String {
        return "Huevos agregados a la receta"
    }
}