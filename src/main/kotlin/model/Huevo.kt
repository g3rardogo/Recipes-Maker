package model

class Huevo(): Receta() {
    val menu = listOf<String>("Huevo")
    val receta = Receta()

    override fun create(response: String, menu: List<String>) {
        println(response)
        ingredientes.add(menu[response.toInt() - 7])
        cantidad(menu[response.toInt() - 7], menu)
    }

    override fun cantidad(ingrediente: String, menu: List<String>) {
        println("Ingrese la cantidad de $ingrediente y su unidad de medida")
        val response: String? = readLine()
        ingredientes.add(response.toString())
        println("Ingrediente agregado exitosamente")
        println(ingredientes)
        if (response != null) {
            makeRecipe(response)
        }
    }
    fun main(response: String){
        create(response, menu)
    }
}