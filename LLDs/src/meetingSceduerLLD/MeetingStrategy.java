package meetingSceduerLLD;

import java.util.LinkedList;

public interface MeetingStrategy {

	public Room selectRoom(LinkedList<Room> emptyRooms);
}
