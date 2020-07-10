fun main() {
    val meeting = Meeting()

    println("Created: $meeting")

    val participant = Participant()
    val name = Name()
    name.name = "Kelvin"
    participant.name = name
    participant.email = "Kelvin@Rocksolidknowledge.com"
    meeting.addParticipant(participant)

//    meeting.meetingName = "Review"
}