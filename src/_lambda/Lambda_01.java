package _lambda;

public class Lambda_01 {
    public static void main(String[] args) {
        //使用Lambda的标准格式简化匿名内部类的代码形式
        Animal a =new Animal() {
            @Override
            public void run() {
                System.out.println("run run run run");
            }
            
        };
        a.run();
    }
}

abstract class Animal{
    public abstract void run();
}