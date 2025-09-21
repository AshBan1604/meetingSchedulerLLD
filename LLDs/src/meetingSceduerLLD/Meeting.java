package meetingSceduerLLD;

import java.util.List;

public class Meeting {

	private List<Participants> participantList;
	private TimeSlot timeSlot;
	
	public Meeting(List<Participants> participantList, TimeSlot timeSlot) {
		this.participantList = participantList;
		this.timeSlot = timeSlot;
	}

	public void notifyParticipants(String string) {
		for(Participants participants : participantList) {
			participants.notify(string, participants.name, participants.emailID);
		}
	}

}
