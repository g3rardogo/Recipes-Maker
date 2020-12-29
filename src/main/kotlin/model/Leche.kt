package model

class Leche(): Product() {
    override fun create(): String {
        return "Leche agregada a la receta"
    }

    fun menu(){
        println("Leche:\n1.Leche desnatada\n2.Leche entera")
    }
}