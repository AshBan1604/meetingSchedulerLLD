package meetingSceduerLLD;

public class Room{

	int roomID;
	Calender calender;
	Meeting meeting;
	
	
	public Room(int roomID) {
		this.roomID = roomID;
		this.calender = new Calender();
	}

	public synchronized boolean isAvailable(TimeSlot timeSlot) {
		return calender.isAvailable(timeSlot);
	}

}
