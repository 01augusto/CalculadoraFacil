package org.example

fun main() {
    println("Digite sua Operação")
    val op = readln().trim().replace(" ", "")

    if (op.contains("+")){
        val soma = op.split("+")
        val s = (soma[0].toInt() + soma[1].toInt())
        println(s)
    } else if(op.contains("*")) {
        val soma = op.split("*")
        val s = (soma[0].toInt() * soma[1].toInt())
        println(s)
    } else if (op.contains("/")){
        val soma = op.split("/")
        val s = (soma[0].toInt() / soma[1].toInt())
        println(s)
    } else if (op.contains("-")){
        val soma = op.split("-")
        val s = (soma[0].toInt() - soma[1].toInt())
        println(s)
    }else{
        println("Operação Não existente")
    }



}