fun main() {
    val n = 10
    var a = 0
    var b = 1
    println(a)
    println(b)
    for (i in 3..n) {
        val c = a + b
        println(c)
        
        a = b
        b = c
    }
}
