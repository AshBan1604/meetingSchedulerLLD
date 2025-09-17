package meetingSceduerLLD;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		
		MeetingController meetingController = new MeetingController();
		meetingController.addRoom(room1);
		meetingController.addRoom(room2);
		
		Participants participants = new Participants("Ashish", "ashish@gmail.com");
		List<Observer> participantList = new ArrayList<>();
		participantList.add(participants);
		
		
		MeetingScheduler meetingScheduler = new MeetingScheduler(new BusinessNeed(), meetingController);
		Room room = meetingScheduler.scheduleMeet("Critical",participantList, new TimeSlot(12,1));
		
		System.out.println(room.roomID);

		System.out.println("=========================================");
		
		Participants participants2 = new Participants("Ashish", "ashish@gmail.com");
		List<Observer> participantList2 = new ArrayList<>();
		participantList2.add(participants2);
		
		
		MeetingScheduler meetingScheduler2 = new MeetingScheduler(new BusinessNeed(), meetingController);
		Room newMeetRoom = meetingScheduler2.scheduleMeet("Critical",participantList2, new TimeSlot(12,1));
		
		System.out.println(newMeetRoom!=null ? newMeetRoom.roomID : "All rooms booked");
	
		System.out.println("=========================================");
		
		Participants participants3 = new Participants("Ashish", "ashish@gmail.com");
		List<Observer> participantList3 = new ArrayList<>();
		participantList3.add(participants3);
		
		
		MeetingScheduler meetingScheduler3 = new MeetingScheduler(new BusinessNeed(), meetingController);
		Room newMeetRoom1 = meetingScheduler3.scheduleMeet("Critical",participantList3, new TimeSlot(14,15));
		
		System.out.println(newMeetRoom1!=null ? newMeetRoom1.roomID : "All rooms booked");

	}

}
