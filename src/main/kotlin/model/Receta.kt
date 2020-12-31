package model

open class Receta {
    val ingredientes = mutableListOf<String>()

    open fun nameRecipe(){
        println("Ingrese el nombre de la receta:")
        val nombre: String? = readLine()
        if (nombre != null) {
            ingredientes.add(nombre.toString())
            println(ingredientes)
        }
    }

}