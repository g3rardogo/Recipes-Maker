package model

class Cereal(): Product() {
    override fun create(): String{
        return "Cereal agregado a la receta"
    }

    fun menu(){
        println("Cereales:\n1.Avena\n2.Trigo\n3.Uvas\n4.Arroz\n5.Maiz")
    }
}