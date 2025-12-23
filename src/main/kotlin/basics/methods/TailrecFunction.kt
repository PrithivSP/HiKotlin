package basics.methods

tailrec fun sum(num:Int, result: Long): Long {
    if(num == 0) return result

     return sum(num - 1, result + num)
}

fun tailrecFunction() {
    println("Tail recursion is converted into loop" + sum(50000, 0))
}


















// tailing(tail rec) function - means the recursion happens at last, after the recursion call nothing happens
//                              - if a recursion is safe, convert it into loop
//                              - no stack growth
//                              - no stack overflow error
//