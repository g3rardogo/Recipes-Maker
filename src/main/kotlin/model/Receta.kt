package model

open class Receta{
    private val ingredientes = mutableListOf<String>()

    //Funcion que muestra el menu de ingredientes
    fun makeRecipe(){
        Receta().nameRecipe()
        val menuIngredientes = """Seleccione los ingredientes:
1. Agua
2. Leche
3. Carne
4. Verduras
5. Frutas
6. Cereal
7. Huevos
8. Aceite
9. Salir
        """
        println(menuIngredientes)
        val response: String? = readLine()
        when(response){
            "1" -> {Agua().cantidad()}
            "2" -> {Leche().menu()}
            "3" -> {Carne().cantidad()}
            "4" -> {Verdura().menu()}
            "5" -> {Fruta().menu()}
            "6" -> {Cereal().menu()}
            "7" -> {Huevo().cantidad()}
            "8" -> {Aceite().main()}

        }
    }

    //Funcion que le asigna un nombre a la receta
    fun nameRecipe(){
        var nameRecipe: String = "Receta"
        do {
            println("Ingrese el nombre de la receta:")
            val response: String? = readLine()
            if (response != null) {
                nameRecipe = response
            }
        } while (response == null || response == "")
        if (nameRecipe == null || nameRecipe == "") {
            println(ingredientes)
        }
    }

    //Funcion que agrega los ingredientes a la receta
    fun create(response: String, menu: List<String>) {
        ingredientes.add(menu[response.toInt() - 1])
        //println(menu[response.toInt() - 1]
        cantidad(menu[response.toInt() - 1], menu)
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
                makeRecipe()
            } else {
                create(response, menu)
            }
        }
    }


    //Funcion que solicita la cantidad del ingrediente seleccionado
    fun cantidad(ingrediente: String, menu: List<String>){
        println("Ingrese la cantidad de $ingrediente")
        val response: String? = readLine()
        ingredientes.add(response.toString())
        println("Ingrediente agregado exitosamente")
        println(ingredientes)
        showMenu(menu)
    }

}