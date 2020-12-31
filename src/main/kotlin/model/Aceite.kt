package model

class Aceite(): Product() {
    val menu = listOf<String>("1. Aceite de girasol", "2. Aceite de oliva", "3. Aceite de coco", "4. Aceite de palma")
    //Cambiar a int
    override fun create(response: String) {
        ingredientes.add(menu[response.toInt() - 1])
        //println(menu[response.toInt() - 1]
        println(ingredientes)
        menu()
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