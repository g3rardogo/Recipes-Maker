package model

class Aceite(): Product() {
    val menu = listOf<String>("1. Aceite de girasol", "2. Aceite de oliva", "3. Aceite de coco", "4. Aceite de palma")

    //Cambiar a int
    override fun create(response: String) {
        for (respuesta in response){
            receta.plus(menu[response.toInt()])
            println(menu[response.toInt()])
        }
    }

    fun menu(){
        for (ingredient in menu){
            println(ingredient)
        }
        val response: String? = readLine()
        println(response)
        if (response != null) {
            create(response)
        }
    }

}