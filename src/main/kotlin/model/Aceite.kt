package model

class Aceite(): Product() {
    val menu = listOf<String>("Aceite de girasol", "Aceite de oliva", "Aceite de coco", "Aceite de palma")
    //Cambiar a int
    override fun create(response: String) {
        ingredientes.add(menu[response.toInt() - 1])
        //println(menu[response.toInt() - 1]
        cantidad(menu[response.toInt() - 1])
    }

    fun menu(){
        for (ingredient in menu){
            println(ingredient)
        }
        val response: String? = readLine()
        if (response != null) {
            create(response)
        }
    }

    fun cantidad(ingrediente: String){
        println("Ingrese la cantidad de $ingrediente")
        val response: String? = readLine()
        ingredientes.add(response.toString())
        println(ingredientes)
        println("Ingrediente agregado exitosamente")
        menu()
    }
}