package Lessons
fun main() {

// const val --> o‘zgarmas (read-only, immutable) o‘zgaruvchi
// const var -->  o‘zgaruvchan (mutable) o‘zgaruvchi

// Sonlarga oid ---> ichiga butun sonlarni oladi
    val byteNum : Byte // 8 bit
    val shortNum : Short // 16 bit
    val intNum : Int = 10  // 32 bit
    val unitNum : UInt // 32 bit
    val longNum : Long  // 64 bit

// Narsalarga oid ---> oz ichiga qoldiqli sonlarni oladi
    val doubleNum : Double = 234.642 // 64 bit
    val floatNum : Float = 432.2432f // 32 bit

// Sozlar oid --> oz ishiga komment qoldirsa boladi
    val stringValue : String = "Salom "
    val charValue : Char = '1'

// Mantiqiy oid --> Tog`ri yoki notog`ri
    val trueValue : Boolean = true
    val falseValue : Boolean = false

// bu code orqali ::class.java.simpleName biz qanday Classni Ishlatganimizni bilsak boladi
// Misol uchun
    val c = intNum + floatNum
    println(c::class.java.simpleName)
    val c1 = intNum + floatNum + doubleNum
    println(c1::class.java.simpleName)

// qo`shish

    var plus = 0

//var bolimida aytib otganimdek bu uolimda qiymatlarni ozgartirish imkoni bor

    plus = plus + 1
    plus += 1
    println(plus)

// taqqoslash operatorlari
//    Boolean tomonidan yaratiladi
//    var a = 5
//    var b = 7
//
//    println(a > b)
//    println(a < b)
//    println(a >= b)
//    println(a == b)
//    println(a <= b)
//    println(a != b)




}