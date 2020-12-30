package model

class Carne(): Product() {
    override fun create(response: String) {
        println("Carne agregada a la receta")
    }

    fun cantidad(){
        println("Ingrese la cantidad de agua a agregar: ")
        val response: String? = readLine()
        if (response != null) {
            create(response)
        }
    }

}