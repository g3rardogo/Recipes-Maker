fun main() {
    fun showMainMenu(){
        println(":: Bienvenido a Recipe Maker::")
        println("Seleccione la opcion deseada")
        println("1. Hacer una receta")
        println("2. Ver mis recetas")
        println("3. Salir")
    }

    fun showMakeRecipe(){
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

    }
    do{
        showMainMenu()
        val response:String? = readLine()
        if (response == "1"){
            do {
                showMakeRecipe()
                val responseRecipe: String? = readLine()
            } while (responseRecipe != "9")
        }
    } while (response != "3")
}