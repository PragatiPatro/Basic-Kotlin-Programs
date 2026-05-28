fun largest(a: Int, b: Int, c: Int): Int {
    return if (b >= a && b>= c)
         a
    else if (b >= a && b >= c)
         b
    else
         c
}

fun main() {
    println(largest(10, 25, 15))
}
