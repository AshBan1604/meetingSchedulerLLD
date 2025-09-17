package meetingSceduerLLD;

import java.util.List;

public class Meeting {

	private List<Observer> participantList;
	private TimeSlot timeSlot;
	
	public Meeting(List<Observer> participantList, TimeSlot timeSlot) {
		this.participantList = participantList;
		this.timeSlot = timeSlot;
	}

	public void notifyParticipants(String string) {
		for(Observer participants : participantList) {
			participants.notify(string);
		}
	}

}
