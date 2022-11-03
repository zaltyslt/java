import java.sql.Time;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class StopWatch {//©KS
//	LocalDate 	Represents a date (year, month, day (yyyy-MM-dd))
//	LocalTime 	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
//	LocalDateTime 	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
//	DateTimeFormatter 	Formatter for displaying and parsing date-time objects
	
	
	private LocalTime startTime;
	private LocalTime endTime;

	public StopWatch() {
		startTime = LocalTime.now();
	}
	
	public void start() {
		this.startTime = LocalTime.now();
	}
	
	public void stop() {
		this.endTime = LocalTime.now();
	}
    public long getElapsedTime() {
    	
    	return (endTime.toNanoOfDay() - startTime.toNanoOfDay()) / 1_000_000;
 
    	}
    
    @Override
    public String toString() {
    	return getElapsedTime() + " miliSeconds ("+getElapsedTime() / 1000.0+" seconds)";
    	}
}
