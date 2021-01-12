package week1.day1;

public class Mobile {
	
	public void sendSMS() {
		System.out.println("message sent");
	}
	private void makeCall() {
		System.out.println("call connected");

	}
public static void main(String[] args) {
	Mobile samsung = new Mobile();
	samsung.sendSMS();
	samsung.makeCall();
}
}
