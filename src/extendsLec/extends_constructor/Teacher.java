package extendsLec.extends_constructor;

public class Teacher extends People{
    public  Teacher(String name, int age){
        //调用分类构造器， 初始化继承自父类的数据
        super(name, age);
    }
}
