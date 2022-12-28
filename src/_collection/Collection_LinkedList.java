package _collection;

import java.util.LinkedList;

public class Collection_LinkedList {
    public static void main(String[] args) {
        // LinkedList 可以完成 列队结构 & 栈结构 （双链表）
        // 1.列队结构
        LinkedList<String> queue = new LinkedList<>();
        // 入队
        queue.addLast("No.1");
        queue.addLast("No.2");
        queue.addLast("No.3");
        System.out.println(queue);

        //出队
        System.out.println(queue.getFirst());//只是提取第一个，不会把他从第一个一出
        System.out.println(queue.removeFirst());//提取第一个并从list移除
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);


        //2.栈
        LinkedList<String> stack = new LinkedList<>();
        //入栈 压栈 (push)
        stack.addFirst("1111");
        stack.addFirst("2222");
        stack.push("3333");
        stack.push("4444");
        //出栈 弹栈 (pop)
        System.out.println(stack.pop());
        System.out.println(stack.removeFirst());
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}