package guestbook.model;

public class Message {
	private int id;
	private String guestname;
	private String password;
	private String message;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getGuestName() {
		return guestname;
	}
	
	public void setGuestName(String guestName) {
		this.guestname = guestName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public boolean hasPassword() {
		return password != null && !password.isEmpty();
	}
	
	public boolean matchPassword(String pwd) {
		return password != null && password.equals(pwd);
	}
	
}
