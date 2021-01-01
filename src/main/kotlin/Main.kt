import model.*
fun main() {
    //Ciclo que muestra el menu principal y lee las opciones que el usuario ingresa
    do{
        Receta().showMainMenu()
        //variable que guarda la opcion que el usuario ingresa
        val response:String? = readLine()
        if (response == "1"){
            Receta().makeRecipe(response)
        } else if (response == "2"){
            Receta().viewRecipe()
        }
    } while (response != "0")
}