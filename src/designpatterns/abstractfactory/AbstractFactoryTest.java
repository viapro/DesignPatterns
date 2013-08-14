package designpatterns.abstractfactory;

public class AbstractFactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IProvider provider = new SenderMailFactory();
		ISender sender = provider.produce();
		sender.send();
	}

}
