package meetingSceduerLLD;

import java.util.ArrayList;
import java.util.List;

public class Calender {

	List<TimeSlot> bookings = new ArrayList<>();
	
	public void addTimeSlot(TimeSlot slot) {
        this.bookings.add(slot);
    }

    public void removeTimeSlot(TimeSlot slot) {
        this.bookings.remove(slot);
    }
	
	public boolean isAvailable(TimeSlot timeSlot) {
		if(this.bookings.size() == 0) {
            return true;
        }
        for(TimeSlot bookedSlot: this.bookings) {
            if(timeSlot.isOverlapping(timeSlot, bookedSlot)) {
                return false;
            }
        }
        return true;
	}

	
}
