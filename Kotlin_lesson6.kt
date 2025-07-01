package Lessons
// Reklamani Sekindini tugashini qilamiz

//6 dars
//fun main() {

    // while , do while

//    var counter = 5

//    while (counter >= 0) {
//        println("Reklama tugaydi ${counter--}")
//        Thread.sleep(1000)
//    }

//    do {
//        println("Reklama tugaydi ${counter--}")
//        Thread.sleep(1000)
//    } while (counter > 0)


//}

// 7 dars

fun main(){

    // for , break , continue , return , until , (..)

    val range = 1..100
    val range1 = 1 until 100
    val range2 = 1L .. 100L
    val range3 = 'a' .. 'z'
    val range4 = 1.0 .. 100.0
    val range5 = 1.0f .. 100.0f
    val range6 = 1 .. 100 step 2
    val range7 = 1 downTo 100 step 2

    // in , !in

    val  a = 52 in range1  // --> range1da 52 ichida bor
    val  b = 52 !in range1 // --> range1da 52 ichida yoq deyilyapti
    // lekin range1 1dan 99 sonlar bor


    // for
    // break , continue , return

    for (i in 5 downTo 1){
//        bu funksiya 3 soniyani ozgartiradi
        if(i == 3) {
//            println("User tugmani bosdi \"Otkizish\"")
//            break                                         // ---> bu 3-soniyagacha ishlaydi bu faqat (if)da ishlaydi

//            println("User tugmani bosdi \"Otkizish\"")
//            return                                        // ---> bu 3-chi sekunda ishini toxtatadi

//            println("User tugmani bosdi \"Otkizish\"")
//            continue                                      // --->
        }
        println("Reklama tugaydi $i")
        Thread.sleep(1000)
    }

}