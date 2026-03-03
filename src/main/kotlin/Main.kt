package org.example

fun main() {
    println("Digite a expressão (ex: 5 + 7):")
    val input = readLine() ?: return

    val regex = Regex("""\s*(-?\d+(?:\.\d+)?)\s*([+\-*/])\s*(-?\d+(?:\.\d+)?)\s*""")
    val match = regex.matchEntire(input)

    if (match != null) {
        val (n1, operator, n2) = match.destructured
        val a = n1.toDouble()
        val b = n2.toDouble()

        val result = when (operator) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> if (b != 0.0) a / b else {
                println("Erro: divisão por zero")
                return
            }
            else -> {
                println("Operador inválido")
                return
            }
        }

        if (result % 1.0 == 0.0) {
            println(result.toInt())
        } else {
            println(result)
        }
    } else {
        println("Expressão inválida")
    }
}