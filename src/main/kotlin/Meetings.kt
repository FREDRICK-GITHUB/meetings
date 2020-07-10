
class Meeting{
    internal val logger = Logger()

    var meetingName: String = ""
    fun addParticipant( participant: Participant){
        if(verifyParticipant(participant))
        println("Added: ${participant.name}")
    }

    private fun verifyParticipant(participant: Participant) : Boolean{
        println("Try to verify")
        return true
    }
    protected fun verifyMeeting(){

    }
}

class Participant{
    var name = ""
    var email = ""

    val canonicalEmail: String
        get() = email.toUpperCase()
}