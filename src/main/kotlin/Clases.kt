fun main() {
    // Data class
    val persona = Persona("mimi", 25)  // Crea una instancia de la clase Persona usando un data class
    println("Nombre: ${persona.nombre}, Edad: ${persona.edad}")

    // Member function (Clase con función miembro)
    val calculadora = Calculadora()
    // Crea una instancia de Calculadora y llama al metodo sumar para sumar dos números
    val suma = calculadora.sumar(5, 3)
    println("Suma de 5 + 3: $suma")

    // Access properties (Clase con propiedades)
    val Coche = Coche("Rojo", 2024)
    println("Color del Coche: ${Coche.color}")
    println("Año del Coche: ${Coche.anio}")

    // Properties
    val gato = Gato("Miau")
    println("Nombre del gato: ${gato.nombre}")
    println("Sonido del gato: ${gato.hacerSonido()}")

    // Create instance
    val libro = Libro("1984", "Simon hills")
    println("Título: ${libro.titulo}, Autor: ${libro.autor}") // Crea una instancia de la clase Libro y accede a sus propiedades titulo y autor
}

// Data class
data class Persona(val nombre: String, val edad: Int)

// Member function
class Calculadora {
    fun sumar(a: Int, b: Int): Int = a + b
}

// Access properties
class Coche(val color: String, val anio: Int)

// Properties
class Gato(val nombre: String) {
    fun hacerSonido() = "¡Miau!"
}

// Create instance
class Libro(val titulo: String, val autor: String)
