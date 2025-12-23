package basics.controlflow

fun loops() {
    val userIds = listOf("u1", "u2", "u3")

    for (id in userIds) {
        println("User id: $id")
    }

    for(id in userIds.indices) {
        println("User id: ${userIds[id]}")
    }

    //range
    outer@ for(row in 1..100) {
        for (col in 1..100) {
            if(row == 50) continue@outer
            println("Seat label: $row$col")
        }
    }
}













// core -> loops are made to iterate on values not indexes
// range -> a progression of values with start, end, and optional step (numbers (float and double), characters)

//continue, break - allowed only in the loops except forEach loop