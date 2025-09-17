package meetingSceduerLLD;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MeetingController {

	private List<Room> meetingRooms = new ArrayList<>();

	public void addRoom(Room room) {
		
		this.meetingRooms.add(room);
	}

	public LinkedList<Room> getEmptyRoom(TimeSlot timeSlot) {
		LinkedList<Room> availRoom = new LinkedList<Room>();
		
		for(Room room : this.meetingRooms) {
			if(room.isAvailable(timeSlot)) {
				availRoom.add(room);
			}
		}
		return availRoom;
	}
	
	
}
