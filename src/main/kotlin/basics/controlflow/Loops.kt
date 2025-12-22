package basics.controlflow

fun loops() {
    var userId = listOf("u1", "u2", "u3")

    for (id in userId) {
        println("User id: $id")
    }

    outer@ for(row in 1..100) {
        //range
        for (col in 1..100) {
            if(row == 50) continue@outer
            println("Seat label: $row$col")
        }
    }
}


// core -> loops are made to iterate on values not indexes
//range -> sequence of values with start, end and step