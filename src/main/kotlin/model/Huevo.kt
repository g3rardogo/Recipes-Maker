package model

class Huevo(): Product() {
    override fun create(response: String) {
        println("Huevos agregados a la receta")
    }

    fun cantidad(){
        println("Ingrese la cantidad de agua a agregar: ")
        val response: String? = readLine()
        if (response != null) {
            create(response)
        }
    }
}