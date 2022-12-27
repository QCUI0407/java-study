package _lambda;

public class Lambda_02 {
    public static void main(String[] args) {
        // 使用Lambda的标准格式简化匿名内部类的代码形式
        //Lambda只能简化接口中只有一个抽象方法的匿名内部类形式

        // Swimming s1 = new Swimming() {
        //     @Override
        //     public void swim() {
        //         System.out.println("override--------");
        //     }            
        // };

        /*简化 */
        Swimming s1 = () -> {
            System.out.println("override--------");
        };
        go(s1);

        /*再简化 */
        System.out.println("----------------------------");
        go(() -> {
            System.out.println("----------override--------");
        });

        
    }

    public static void go(Swimming s){
        System.out.println("start-----");
        s.swim();
        System.out.println("End---------");
    }
}

@FunctionalInterface  //一旦加上这注释必须时函数式接口，里面只能有一个抽象方法
interface Swimming{
    void swim();
}
