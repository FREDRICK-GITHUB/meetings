import java.lang.IllegalArgumentException

class Meeting {
    internal val logger = Logger()

    var meetingName: String = ""
    fun addParticipant(participant: Participant) {
        if (verifyParticipant(participant))
            println("Added: ${participant.participantName}")
    }

    private fun verifyParticipant(participant: Participant): Boolean {
        println("Try to verify")
        return true
    }

    protected fun verifyMeeting() {

    }
}

class Participant {
    var name: Name = Name()
    var email = ""

    val participantName: String
        get() = name.name

    val canonicalEmail: String
        get() = email.toUpperCase()
}

class Name {
    var name: String = ""
        set(value: String) {
            if (value.isNullOrBlank()) throw IllegalArgumentException()
            field = value
        }
}