fun main(args: Array<String>) {
    // Değişken tanımlamaları 'var' veya 'val' şeklinde yapılabilir.
    var isim = "Fatmanur"
    println(isim) //Fatmanur

    //değişken tanımlamalarında tip belirtilebilir
    var numara:Int = 9

    //sabit değişkenler 'val' ile tanımlanırlar
    val pi = 3.14

    //değişkenlere null atayabilemk için değişken tipinin sonuna '?' koyulur.
    var a: Boolean?
    a = null

    //String bir değerin uzunluğunu bulma:
    var b: String = "Kotlin Dersleri"
    println(b.length)  //15

    //NULL olabilir şeklinde tanımlanan değişkenlerde fonsiyonların çağrımı yine '?' ile yapılır.
    var c: String? = "Kotlin"
    println(c?.length) //6

    //değişkenleri bir metin içerisinde yazdırmak için '$' kullanılır.
    var name = "Kotlin"
    println("$name Dersleri") //Kotlin Dersleri

    //fonksiyon çağrımı ile yazdırmak istersek '{}' içerisinde kullanmamız gerekir.
    println("${name.length} uzunluğunda") //6 uzunluğunda
}