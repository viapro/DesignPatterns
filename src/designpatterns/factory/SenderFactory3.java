package designpatterns.factory;

public class SenderFactory3 {
	public static ISender produceMail(){
		return new MailSender();
	}
	
	public static ISender produceSms(){
		return new SmsSender();
	}
}
