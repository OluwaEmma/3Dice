package com.example.a3dicegame

fun main() {
    val toyota = Toyota (10000000)

    println("\nTOYOTA\n")
    println("Name: ${toyota.name}")
    println("Color: ${toyota.color}")
    println("Cost: ${toyota.cost}")
    println ("Budget: ${toyota.budget}")

    val cost = ("${toyota.cost}")
    val budget = ("${toyota.budget}")


    if (cost > budget) {
        println("Affordable")
    }

    else {
        println("Not Affordable")
    }
}

abstract class Car (var  budget : Int) {
    abstract val name : String
    abstract val color : String
    abstract val cost : Int

}

class Toyota (budget : Int): Car (budget) {
    override val name = "Corolla"
    override val color = "Silver"
    override val cost = 5000000
}