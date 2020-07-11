fun main() {
    val meeting = Meeting("Review",location = Location(""))

    println("Created: $meeting with name ${meeting.meetingName} at ${meeting.location}")

    val name = Name("Kelvin Jones")
    val participant = Participant(name, "Kelvin@Rocksolidknowledge.com")
    meeting.addParticipant(participant)

//    meeting.meetingName = "Review"
}