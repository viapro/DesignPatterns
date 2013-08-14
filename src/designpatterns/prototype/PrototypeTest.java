package designpatterns.prototype;

import java.io.IOException;

/**
 * ԭ��ģʽ
 * 
 */
public class PrototypeTest {

	/**
	 */
	public static void main(String[] args) {
		Prototype prototype = new Prototype();
		prototype.setStr("���");
		SerializableObject so1 = new SerializableObject();
		prototype.setObj(so1);
		System.out.println("=============ǳ��¡==========");
		try {
			//ǳ��¡
			Prototype p1 = (Prototype) prototype.clone();
			System.out.println(prototype.getObj()+prototype.getStr()+prototype.getSerialversionuid());
			System.out.println(p1.getObj()+p1.getStr()+p1.getSerialversionuid());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("=============���¡==========");
		try {
			System.out.println(prototype.getObj()+prototype.getStr()+prototype.getSerialversionuid());
			Prototype p2 = (Prototype) prototype.deepClone();
			System.out.println(p2.getObj()+p2.getStr()+p2.getSerialversionuid());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
