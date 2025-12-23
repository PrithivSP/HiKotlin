package datatypes.classesTypes

sealed class Movie() {
    abstract val movieName: String
    abstract val movieDuration: String
    abstract val movieType: String
    open fun printDetails() {
        println("Movie: $movieName | Duration: $movieDuration | Movie Type: $movieType")
    }
}

class TwoDMovie(
    override val movieName: String, override val movieDuration: String,
    override val movieType: String = "2D"
) : Movie() {

}

class ThreeDMovie(
    override val movieName: String,
    override val movieDuration: String,
    val motionSickness: Boolean,
    val isConvertedFrom2D: Boolean,
    override val movieType: String = "3 D"
) : Movie() {
    override fun printDetails() {
        println("Movie: $movieName | Duration: $movieDuration | Motion Sickness: $motionSickness | Is Converted from 2D: $isConvertedFrom2D")
    }

}

fun sealedClass() {
    val movies: List<Movie> = listOf(
        TwoDMovie("Inception", "2h 28m"),
        ThreeDMovie("Avatar", "2h 42m", motionSickness = true, isConvertedFrom2D = false)
    )

    for (movie in movies) {
        when (movie) {
            is TwoDMovie -> {
                movie.printDetails()
                println("Type: 2D Movie")
            }

            is ThreeDMovie -> {
                movie.printDetails()
                println("Type: 3D Movie")
                println("Motion sickness: ${movie.motionSickness}")
                println("Converted from 2D: ${movie.isConvertedFrom2D}")
            }
        }
    }
}


// sealed class - to restrict class inheritance

// control exactly which subclasses are allowed

// important:
// all subclasses should be in same file
// kotlin use file boundary for sealed classes

// cannot:
// cannot have instances

// can have constructor, init


// properties
// implicitly abstract by default

// memory:
// stored in method area
// extra metadata to track subclasses

