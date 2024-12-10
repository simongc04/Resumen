fun main() {
    var nombre: String? = null

    // Safe call `?.` para evitar NullPointerException
    println(nombre?.length)

    // Elvis operator `?:` para proporcionar un valor por defecto
    val longitud = nombre?.length ?: 3
    println("La longitud es: $longitud")
}
