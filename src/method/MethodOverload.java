package method;

public class MethodOverload {
    public static void main(String[] args) {
        
        fire();
        fire("TV");
        fire("Window", 10);
    }

    // public static void fire(){
    //     System.out.println("Fire one time");
    // }

    public static void fire(){
        fire("Window", 10);
    }

    public static void fire(String location){
        System.out.println("Fire one time target is " + location);
    }

    public static void fire(String location, int num){
        System.out.println("Fire "+ num + " times " + "target is " + location);
    }


}
