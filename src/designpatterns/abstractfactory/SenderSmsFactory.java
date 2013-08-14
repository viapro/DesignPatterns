package designpatterns.abstractfactory;


public class SenderSmsFactory implements IProvider {


	@Override
	public ISender produce() {
		return new SmsSender();
	}

}
