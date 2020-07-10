
fun main(){
   val meeting = Meeting()

    println("Created: $meeting")

    val participant = Participant()
    participant.name = "Kelvin"
    participant.email ="Kelvin@Rocksolidknowledge.com"
    meeting.addParticipant(participant)

//    meeting.meetingName = "Review"
}