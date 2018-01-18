package taouala.model;

public class Mail {
	  private final String senderEmailID = "abdotaouala@gmail.com";
	  private final String senderPassword = "*************";
	  private final String emailSMTPserver = "smtp.gmail.com";
	  private final String emailServerPort = "465";
	  private String receiverEmailID = null;
	  private static String emailSubject = "";
	  private static String emailBody = "";
	  
	public Mail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mail(String receiverEmailID) {
		super();
		this.receiverEmailID = receiverEmailID;
	}

	public static String getEmailSubject() {
		return emailSubject;
	}

	public static void setEmailSubject(String emailSubject) {
		Mail.emailSubject = emailSubject;
	}

	public static String getEmailBody() {
		return emailBody;
	}

	public static void setEmailBody(String emailBody) {
		Mail.emailBody = emailBody;
	}

	public String getReceiverEmailID() {
		return receiverEmailID;
	}

	public void setReceiverEmailID(String receiverEmailID) {
		this.receiverEmailID = receiverEmailID;
	}

	public String getSenderEmailID() {
		return senderEmailID;
	}

	public String getSenderPassword() {
		return senderPassword;
	}

	public String getEmailSMTPserver() {
		return emailSMTPserver;
	}

	public String getEmailServerPort() {
		return emailServerPort;
	}  
	
}
