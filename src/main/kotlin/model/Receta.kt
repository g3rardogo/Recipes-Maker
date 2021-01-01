package model
val ingredientes = mutableListOf<String>()
var nameRecipe: String? = null

open class Receta{

    //Funcion que muestra el menu de ingredientes
    fun makeRecipe(response: String){
        var response: String?
        if(nameRecipe == null){
            do {
                println("Ingresa el nombre de la receta: ")
                response = readLine()
                nameRecipe = response
                if (response != null) {
                    ingredientes.add("Nombre receta: $response")
                }
            } while(response == "")
        }
        val menuIngredientes = "Seleccione los ingredientes:\n1. Agua\n2. Leche\n3. Carne\n4. Verduras\n5. Frutas\n6. Cereal\n7. Huevos\n8. Aceite\n0. Salir"
        println(menuIngredientes)
        response = readLine()
        when(response){
            "0" -> {nameRecipe = null}
            "1" -> {Agua().main(response)}
            "2" -> {Leche().main()}
            "3" -> {Carne().main(response)}
            "4" -> {Verdura().main()}
            "5" -> {Fruta().main()}
            "6" -> {Cereal().main()}
            "7" -> {Huevo().main(response)}
            "8" -> {Aceite().main()}
            else -> {
                if (response != null) {
                    println("Seleccione una opcion correcta")
                    makeRecipe(response)
                }
            }
        }
    }

    //Funcion que muestra el menu principal
    fun showMainMenu(){
        println(":: Bienvenido a Recipe Maker::")
        println("Seleccione la opcion deseada")
        println("1. Hacer una receta")
        println("2. Ver mis recetas")
        println("0. Salir")
    }

    //Funcion que muestra las recetas creadas
    fun viewRecipe(){
        println("::Ver mis recetas::")
    }

    //Funcion que muestra los ingredientes
    fun showMenu(menu: List<String>){
        for (ingredient in menu){
            println(ingredient)
        }
        getResponse(menu)
    }

    fun getResponse(menu: List<String>){
        val response: String? = readLine()
        if (response != null) {
            if(response == "0"){
                makeRecipe(response)
            } else {
                create(response, menu)
            }
        }
    }

    //Funcion que agrega los ingredientes a la receta
    open fun create(response: String, menu: List<String>) {
        ingredientes.add(menu[response.toInt() - 1])
        cantidad(menu[response.toInt() - 1], menu)
    }
    //Funcion que solicita la cantidad del ingrediente seleccionado
    open fun cantidad(ingrediente: String, menu: List<String>){
        println("Ingrese la cantidad de $ingrediente")
        val response: String? = readLine()
        ingredientes.add(response.toString())
        println("Ingrediente agregado exitosamente")
        println(ingredientes)
        showMenu(menu)
    }

}