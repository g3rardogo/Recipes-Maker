package model

class Leche(): Product() {
    override fun create(response: String){
        println("Leche agregada a la receta")
    }

    fun menu(){
        println("Leche:\n1.Leche desnatada\n2.Leche entera")
    }
}