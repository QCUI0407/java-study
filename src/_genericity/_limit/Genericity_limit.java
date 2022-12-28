package _genericity._limit;
/* 通配符： ？
 *  ？可以在使用泛型是代表一切类型
*/

import java.util.ArrayList;

public class Genericity_limit {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<Benz> benzs = new ArrayList<>();
        benzs.add(new Benz());
        benzs.add(new Benz());
        benzs.add(new Benz());
        go(benzs);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        // go(dogs); 没有继承所以不可以用
    }

    /*
     * 所有车比赛
     */
    public static void go(ArrayList<? extends Car> cars) {

    }
}
// 父类
class Car {
}

class Dog {

}

class BMW extends Car {

}

class Benz extends Car {

}

