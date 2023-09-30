package p2;

public class Email {
	
	public void sendEmail() {
		System.out.println("promational");
	}
	
    public void sendEmail(String ptid) {
		System.out.println(ptid);
	}
      public static void main(String[] args) {
    	  Email e = new Email();
    	  e.sendEmail();
    	  e.sendEmail("678qyeqft");
    	  
	}
}
