package _genericity._class;

public class Test {
    public static void main(String[] args) {
        //模拟ArrayList定义一个MyArrayList， 关注泛型设计
        MyArrayList<String> list = new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.remove("bbb");

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(111);
        list2.add(222);
        list2.add(333);
        list2.remove(222);

    }
}
