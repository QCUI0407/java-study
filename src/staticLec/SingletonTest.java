package staticLec;
//eager initialization
public class SingletonTest {
    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.ins;
        SingleInstance s2 = SingleInstance.ins;
        System.out.println(s1 == s2);
    }
    
}
