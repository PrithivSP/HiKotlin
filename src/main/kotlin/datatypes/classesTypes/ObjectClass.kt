package datatypes.classesTypes

object Session {
    var user: String? = null
    fun isUserLoggedIn(): Boolean {
        return user != null
    }
}


fun objectClass() {
    //authentication

    Session.user = "user"
}



// object class - used to create singleton object

// to stop multiple instances
// to stop state inconsistency


// cannot:
// cannot have instances
// cannot have constructor
// cannot inherit other classes

// can:
// can implement other interfaces
// can contain properties, functions and init block

// properties:
// methods should be concrete
// methods are final by default



// memory:
// a static reference lives in method area
// stored in heap
// lazy initialization - object created only when first accessed