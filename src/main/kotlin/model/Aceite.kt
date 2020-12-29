package model

class Aceite(): Product() {
    override fun create(): String {
        return "Aceite agregado a la receta"
    }

    fun menu(){
        println("Aceites:\n1.Aceite de girasol\n2.Aceite de oliva\n3.Aceite de coco\n4.Aceite de palma")
    }

}