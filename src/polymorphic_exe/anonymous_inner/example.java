package polymorphic_exe.anonymous_inner;

/*
 * 匿名内部类使用形式（语法）
 */

public class example {
    public static void main(String[] args) {
        //命名子类
        Swim s = new Student();
        go(s);

        System.out.println("----------------------");
      //匿名
        Swim s1 = new Swim() {          
            @Override
            public void swimming() {  
                System.out.println("Teacher 0000000---00000");          
            }           
        };
        go(s1);

        System.out.println("------------------------");
        
        go(new Swim() {          
            @Override
            public void swimming() {  
                System.out.println("Player 0000000---00000");          
            }           
            
        });
    }

    /*学生 老师 运动员 可以一起参加比赛 */
    public static void go(Swim s){
        System.out.println("Start");
        s.swimming();
        System.out.println("End...");
    }

}
// 匿名不需要定义子类
class Student implements Swim{

    @Override
    public void swimming() {
        System.out.println("Student 0000000---00000");
    }
    
}

interface Swim{
    void swimming();
}