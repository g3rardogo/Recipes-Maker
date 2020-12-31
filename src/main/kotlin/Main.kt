import model.*
fun main() {
    //Funcion que muestra el menu principal
    fun showMainMenu(){
        println(":: Bienvenido a Recipe Maker::")
        println("Seleccione la opcion deseada")
        println("1. Hacer una receta")
        println("2. Ver mis recetas")
        println("3. Salir")
    }

    //Funcion que muestra el menu de ingredientes
    fun makeRecipe(){
        Receta().nameRecipe()
        println("Seleccione los ingredientes:")
        println("1. Agua")
        println("2. Leche")
        println("3. Carne")
        println("4. Verduras")
        println("5. Frutas")
        println("6. Cereal")
        println("7. Huevos")
        println("8. Aceite")
        println("9. Salir")
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

    //Funcion que muestra las recetas creadas
    fun viewRecipe(){
        println("::Ver mis recetas::")
    }
    
    //Ciclo que muestra el menu principal y lee las opciones que el usuario ingresa
    do{
        showMainMenu()
        //variable que guarda la opcion que el usuario ingresa
        val response:String? = readLine()
        if (response == "1"){
            do {
                makeRecipe()
                val responseRecipe: String? = readLine()
            } while (responseRecipe != "9")
        } else if (response == "2"){
            viewRecipe()
        }
    } while (response != "3")
}