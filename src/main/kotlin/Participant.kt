
class Participant(val name: Name, val email: String) {
//    var name: Name = Name()
//    var email = ""

    val participantName: String
        get() = name.name

    val canonicalEmail: String
        get() = email.toUpperCase()
}