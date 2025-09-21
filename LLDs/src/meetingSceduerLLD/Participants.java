package meetingSceduerLLD;

public class Participants implements Observer{

	String name;
	String emailID;
	
	public Participants(String name, String emailID) {
		this.name = name;
		this.emailID = emailID;
	}

	@Override
	public void notify(String news, String name, String emailID) {
		System.out.println(news+" and shared notification of it with "+name+" at mailId- "+emailID);
		
	}
	
}
