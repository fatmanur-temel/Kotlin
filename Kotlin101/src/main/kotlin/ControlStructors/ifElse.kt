package ControlStructors

fun main(args: Array<String>) {
    var number: Int = 425
    if (number <100){
        println("The number is less than 100")
    }
    else if (number>=100 && number<200){
        println("The number is less than 200 and greater than 99")
    }
    else if (number in 200..299){
        println("The number is less than 300 and greater than 199")
    }
    else{
        println("The number is greater than 299")
    }

    //içerik tek satırdan oluşuyorsa süslü parantez kullanmadan da yazılabilir
    //if yapısı bir değişkene atanabilir
    var a =3
    var b =5
    var max = if(a>b) a else b
    println(max) //5
}