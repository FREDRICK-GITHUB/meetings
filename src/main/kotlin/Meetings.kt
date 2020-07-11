import java.lang.IllegalArgumentException

class Meeting(val meetingName: String, var location: Location =  Location("An address")) {

    internal val logger = Logger()



//    val meetingName: String
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

class Location(val address: String){

}

