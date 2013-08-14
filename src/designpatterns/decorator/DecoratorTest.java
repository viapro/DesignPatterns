package designpatterns.decorator;

/**
 * װ��ģʽ
 * @author dengdashuai
 *
 */
public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sourceable sourceable = new Source();
		Sourceable sourceable2 = new Decorator(sourceable);
		sourceable2.method();
		
	}

}
