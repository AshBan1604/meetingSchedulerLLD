package meetingSceduerLLD;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MeetingScheduler {
	private MeetingStrategy meetingStrategy;
	private MeetingController controller;
	
	public MeetingScheduler(MeetingStrategy meetingStrategy, MeetingController meetingController) {
		this.meetingStrategy = meetingStrategy;
		controller = meetingController;
	}

	public Room scheduleMeet(String requirement, List<Observer> participantList, TimeSlot timeSlot) {
		LinkedList<Room> emptyRooms = controller.getEmptyRoom(timeSlot);
		Room selectedRoom = meetingStrategy.selectRoom(emptyRooms);
		
		if(selectedRoom != null) {
			selectedRoom.meeting = new Meeting(participantList, timeSlot);
			selectedRoom.calender.addTimeSlot(timeSlot);
			selectedRoom.meeting.notifyParticipants("Created a new meet to attend which is of type "+requirement);
		}else {
			System.out.println("No room available at the mentioned timeslot");
		}
		return selectedRoom;
	}
	
	
	
	
}
