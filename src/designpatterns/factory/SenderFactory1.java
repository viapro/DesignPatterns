package designpatterns.factory;

/**
 * ��ͨ����ģʽ
 * @author dengdashuai
 *
 */
public class SenderFactory1 {
	public ISender produce(String type){
		if ("mail".equals(type)) {
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			return null;
		}
	}
}
