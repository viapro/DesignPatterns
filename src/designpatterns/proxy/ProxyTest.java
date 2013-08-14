package designpatterns.proxy;

/**
 * ����ģʽ
 * @author dengdashuai
 *
 */
public class ProxyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Source source = new Source();
		Proxy proxy = new Proxy(source);
		proxy.method();
	}

}
