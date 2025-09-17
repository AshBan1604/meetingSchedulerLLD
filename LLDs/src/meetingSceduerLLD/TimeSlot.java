package meetingSceduerLLD;

public class TimeSlot {

	int strTime;
	int endTime;
	
	public TimeSlot(int strTime, int endTime) {
		this.strTime=strTime;
		this.endTime=endTime;
	}

	public boolean isOverlapping(TimeSlot timeSlot, TimeSlot bookedSlot) {
		if((timeSlot.strTime < bookedSlot.strTime && timeSlot.endTime <= bookedSlot.strTime) || 
				(timeSlot.strTime >= bookedSlot.endTime && timeSlot.endTime > bookedSlot.endTime))
			return false;
		return true;
	}

}
