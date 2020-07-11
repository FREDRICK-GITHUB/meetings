

class Name(var name: String) {
    init {
        if (name.isBlank()) throw IllegalArgumentException()
    }
}