package designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ģʽ
 * @author dengdashuai
 *
 */
public class Builder {
	private List<ISender> list = new ArrayList<ISender>();
	
	
	public List<ISender> getList() {
		return list;
	}

	public void setList(List<ISender> list) {
		this.list = list;
	}

	//����ָ����ݵĶ���
	public void produceMailSender(int count){
		for(int i = 0;i<count;i++){
			list.add(new MailSender());
		}
	}
	
	//����ָ����ݵĶ���
	public void produceSmsSender(int count){
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}
}
