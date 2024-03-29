package staticLec;

//单例模式中的懒汉（lazy initialization)
public class SingleInstance2 {

    /*
     * 2.定义一个静态的成员变量负责存储一个对象， 只加载一次， 只有一份
     * 最好私有化，这样可以避免鄙人调用时为null
     */
    private static SingleInstance2 ins;

    /*
     * 3.提供一个方法，对外返回单例对象
     */
    public static SingleInstance2 getInstance(){
        if(ins == null){
            //第一次来拿对象， 此时需要创建对象
            ins = new SingleInstance2();
        }
        return ins;
    }

    /*
     * 1.私有构造器
     */
    private SingleInstance2() {
    }
}
