package designpatterns.builder;

public class SmsSender implements ISender {

	@Override
	public void send() {
		System.out.println("this is smssender");
	}

}
