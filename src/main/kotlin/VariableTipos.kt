fun main(){
    //Variables y Tipos de datos de Kotlin
    //val para constantes
    //var para variables

    val name="Abraham Quiroz"
    var age=19
    print("Hola, mi nombre es: "+name+" y tengo ")
    println(""+age+" años")

    //Las variables val no cambian, pero la var si mientras sean del mismo tipo

    //Declaracion e inicializacion
    val city: String

    city="una ciudad"

    //Puede ser junto

    val isMarried: Boolean=false
    val cars: Int=0
    val height:Double=1.83

    println("Estoy $isMarried")
    println("Mido $height")

    //String Templates
    //$ para imprimir valor de variables
    //${} para procesos antes de imprimir
    println("Hola, soy $name y tengo $age años")
    println("Vivo en $city, y tengo $cars carros :D")

    println("En 2030 tendré ${cars+0} hijos")
}



