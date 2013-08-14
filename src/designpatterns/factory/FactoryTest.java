package designpatterns.factory;

public class FactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SenderFactory1 senderFactory = new SenderFactory1();
		ISender mailSender = senderFactory.produce("mail");
		ISender smsSender = senderFactory.produce("sms");
		ISender wSender  = senderFactory.produce("weixin");
		mailSender.send();
		smsSender.send();
		//�����쳣
		wSender.send();
		
		/*
		SenderFactory2 senderFactory2 = new SenderFactory2();
		Sender senderMail = senderFactory2.produceMail();
		Sender senderSms = senderFactory2.produceSms();
		senderMail.send();
		senderSms.send();*/
		
		
		/*ISender senderMail = SenderFactory3.produceMail();
		ISender senderSms = SenderFactory3.produceSms();
		senderMail.send();
		senderSms.send();*/
	}

}
