fun controlFlow() {
    // Ranges (Rangos)
    println("Rango 1..5")
    // Recorre los valores desde el 1 hasta el 5 (inclusive)
    for (i in 1..5) {
        println(i)
    }

    println("Rango descendente 5..1")
    // Recorre los valores desde el 5 hasta el 1 en orden descendente usando 'downTo'
    for (i in 5 downTo 1) {
        println(i)
    }

    println("Rango con saltos de 2")
    // Recorre los valores desde el 1 hasta el 10, saltando de 2 en 2
    for (i in 1..10 step 2) {
        println(i)
    }

    // Loop While
    println("Loop while")
    var contador = 1
    // Ejecuta el bucle mientras 'contador' sea menor o igual a 3
    while (contador <= 3) {
        println(contador)
        contador++
    }

    // Loop For
    println("Loop for")
    // Recorre los valores del 1 al 3
    for (i in 1..3) {
        println(i)
    }
}
