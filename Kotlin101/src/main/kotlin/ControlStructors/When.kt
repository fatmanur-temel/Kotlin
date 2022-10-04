package ControlStructors

fun main(array: Array<String>){
    var number = 2
    when(number){
        1 -> println("The number is 1")
        2 -> println("The number is 2")
        3 -> println("The number is 3")
        else -> println("The number is unknown")
    }

    //birden fazla satır kullanımında süslü parantez kullanılır.
    when(number){
        1 -> {
            println("The number is 1")
            println("kjdfvndkfjv")
        }
        2 -> {
            println("The number is 2")
            println("kjdfvndkfjv")
        }
        3 -> {
            println("The number is 3")
            println("kjdfvndkfjv")
        }
        else -> {
            println("The number is unknown")
            println("kjdfvndkfjv")
        }
    }

    //when ile aralık bulma
    var number2 = 15
    when(number){
        in 0..20 -> println("The number is between 0 and 20 ")
        !in 0..20 -> println("The number is not between 0 and 20 ")
    }
}