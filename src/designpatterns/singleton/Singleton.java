package designpatterns.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton implements Serializable {

    /*反射时可以使用setAccessible方法来突破private的限制，我们需要做到第一点工作的同时，
      还需要在在 ReflectPermission("suppressAccessChecks") 权限下使用安全管理器（SecurityManager）
      的checkPermission方法来限制这种突破*/
    private Singleton() {
    }

    //volatile关键字取保当instance变量被初始化成Singleton实例是，多个线程正确地处理instance变量
    private volatile static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {  //防止两个线程同时进入同步块
            synchronized (Singleton.class) {
                if (instance == null) {  //必须，
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //When Singleton implements serializable, this method will make sure get the same object.
    //本质上，该方法忽略来新建对象，仍然返回类初始化时创建的那个实例。
    //如何在分布式中保持唯一性？
    public Object readResolve() throws ObjectStreamException {
        return instance;
    }

}
