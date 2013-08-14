package designpatterns.builder;

/**
 * ������ģʽ
 * @author dengdashuai
 *
 */
public class BuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
		builder.produceSmsSender(5);
		System.out.println(builder.getList().size());
	}

}
