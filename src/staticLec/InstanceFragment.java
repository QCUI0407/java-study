package staticLec;

public class InstanceFragment {
    
    public InstanceFragment(){
        System.out.println("-----static fragment-----");
    }
    /**
     * 实例代码块： 无static修饰， 属于对象，每次构建对象时，都会触发执行一次
     */

     {
        System.out.println("==========Instance Fragment===========");
     }

     public static void main(String[] args) {
        InstanceFragment f1 = new InstanceFragment();
        InstanceFragment f2 = new InstanceFragment();
     }
}
