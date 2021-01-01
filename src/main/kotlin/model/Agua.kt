package model

class Agua(): Receta(){
    val menu = listOf<String>("Agua")
    val receta = Receta()

    override fun create(response: String, menu: List<String>) {
        super.create(response, menu)
    }

    override fun cantidad(ingrediente: String, menu: List<String>) {
        println("Ingrese la cantidad de $ingrediente y su unidad de medida")
        val response: String? = readLine()
        ingredientes.add(response.toString())
        println("Ingrediente agregado exitosamente")
        if (response != null) {
            makeRecipe(response)
        }
    }
    fun main(response: String){
        create(response, menu)
    }
}