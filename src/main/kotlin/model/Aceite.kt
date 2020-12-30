package model

class Aceite(): Product() {
    val menu = listOf<String>("1. Aceite de girasol", "2. Aceite de oliva", "3. Aceite de coco", "4. Aceite de palma")

    override fun create(): String {

        return "Aceite agregado a la receta"
    }

    fun menu(){
        for (ingredient in menu){
            println(ingredient)
        }
        val response: String? = readLine()
        println(response)
    }

}