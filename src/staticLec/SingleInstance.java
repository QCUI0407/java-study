package staticLec;

/*
 * 使用饿汉单例 (eager initialization)
 */

public class SingleInstance {
/*
 * 2.饿汉单例实在获取对象前， 对象已经提前准备好。这个对象只能是一个，所以定义静态成员变量
 */


public static SingleInstance ins = new SingleInstance();

    /*
     * 1.必须把构造器私有化
     */
    private SingleInstance(){}
}
