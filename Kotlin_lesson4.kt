package Lessons

fun main() {
    // mantiqiy operatorlar

//    val a = 1 + 1
//    val b = (1 == 1)

//    println(0 < -1)
//    println(1 == 1)
//    println(2 == 3)
//    println(7 != 8)


    // taqqoslash operatorlar
    // turlari --->  < , > , >= , <= , == , !=
    // yana ---> true , false
    // && , || , ! , and

// && --> bu class ikkala funksiya bir vaqt ichida ikklasiham berilgan shartni bajarashi shart!!!
// || --> bu class (yoki) degan manoni anglatadi
// and --> bu class (va) degan manoni anglatadi
// ! --> bu class trueni falsega aylantiradi yani bergan javobni aksini beradi
    // Misol
    // && --> class


/*    val userAge = 15
    val comparisonResult: Boolean = userAge <= Lessons.AGE_OF_MAJORITY && Lessons.RETIREMANT_AGE >= userAge

    println("Natija: $comparisonResult")
*/


    // (||) -->class


/*  val userAge = 15
    val comparisonResult: Boolean = userAge <= Lessons.AGE_OF_MAJORITY || Lessons.RETIREMANT_AGE >= userAge

    println("Natija: $comparisonResult")
*/


    // and --> class

    val userAge = 19
    val comparisonResult: Boolean = (userAge <= AGE_OF_MAJORITY) &&  (RETIREMANT_AGE >= userAge)
    val result = userAge in AGE_OF_MAJORITY..RETIREMANT_AGE
    println("Natija: $result")


    // ! --> class

/*  val a = true
    val b = !a

    println(b)
*/


}

const val AGE_OF_MAJORITY = 18
const val RETIREMANT_AGE = 65