package designpatterns.abstractfactory;

public class SenderMailFactory implements IProvider {

	@Override
	public ISender produce() {
		return new MailSender();
	}

}
