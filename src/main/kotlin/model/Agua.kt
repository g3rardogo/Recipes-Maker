package model

class Agua(): Product(){

    override fun create(response: String) {
        println("Agua agregada a la receta")
    }

    fun cantidad(){
        println("Ingrese la cantidad de agua a agregar: ")
        val response: String? = readLine()
        if (response != null) {
            create(response)
        }
    }
}