package staticLec;

public class StaticMechanism {

    /**
     * static
     */
    public static int onlineNumber = 10;

    public static void test1() {
        System.out.println("====test1=====");
    }

    /**
     * instance 实例
     */

    private String name;

    public void instanceTest() {
        System.out.println(name + "   instance");
    }

    // ---------------------------------------------------------------------------------------

    // 1.静态方法只能访问静态成员， 不能**直接**访问实例成员
    public static void test() {
        System.out.println(onlineNumber);
        System.out.println(StaticMechanism.onlineNumber);
        test1();
        StaticMechanism.test1();
        /**
         * System.out.println(name);
         * instanceTest();
         * 报错，不能**直接**访问实例成员
         */
    }

    // 2.实例方法可以访问静态成员，也可以访问实例成员
    public void instanceMethod() {
        System.out.println(onlineNumber);
        System.out.println(StaticMechanism.onlineNumber);
        test1();
        System.out.println(name);
        instanceMethod();
    }

    // 3.静态方法中不可以出现**this**关键字
    public static void thisTest(){
        //this 只能代表当前对象
        //System.out.println(this);
    }


    public static void main(String[] args) {
        // 理解static 相关语法

    }
}