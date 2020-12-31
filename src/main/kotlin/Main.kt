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
                Receta().makeRecipe()
                val responseRecipe: String? = readLine()
            } while (responseRecipe != "9")
        } else if (response == "2"){
            viewRecipe()
        }
    } while (response != "3")
}