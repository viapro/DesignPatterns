package designpatterns.factory;

/**
 * �๤������ģʽ
 * @author dengdashuai
 *
 */
public class SenderFactory2 {
	public ISender produceMail(){
		return new MailSender();
	}
	
	public ISender produceSms(){
		return new SmsSender();
	}
}
