package meetingSceduerLLD;

import java.util.LinkedList;

public class BusinessNeed implements MeetingStrategy {

	@Override
	public Room selectRoom(LinkedList<Room> emptyRooms) {
		if(!emptyRooms.isEmpty()) {
			System.out.println("Assigning Business meet to selected participants");
			return emptyRooms.getFirst();
		}
		return null;
	}

}
