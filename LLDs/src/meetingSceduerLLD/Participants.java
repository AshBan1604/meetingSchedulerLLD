package meetingSceduerLLD;

public class Participants implements Observer{

	private String name;
	private String emailID;
	
	public Participants(String name, String emailID) {
		this.name = name;
		this.emailID = emailID;
	}

	@Override
	public void notify(String news) {
		System.out.println(news);
		
	}
	
}
