package designpatterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ԭ��ģʽ
 * @author dengdashuai
 *
 */
public class Prototype implements Cloneable,Serializable {
	private static final long serialVersionUID = 1L;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	private String str;
	private SerializableObject obj;
	
	
	
	/**
	 * ǳ����
	 */
	public Object clone() throws CloneNotSupportedException{
		//super.clone()����Ҫ
		Prototype prototype = (Prototype) super.clone();
		return prototype;
	}
	
	/**
	 * ���
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Object deepClone() throws IOException,ClassNotFoundException{
		/*
		 * д�뵱ǰ����Ķ�������
		 * 
		 */
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(this);
		
		
		/*
		 * �������������������
		 */
		ByteArrayInputStream bis = new ByteArrayInputStream(out.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
		
		
		
	}


	public String getStr() {
		return str;
	}


	public void setStr(String str) {
		this.str = str;
	}


	public SerializableObject getObj() {
		return obj;
	}


	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
	
	
}
