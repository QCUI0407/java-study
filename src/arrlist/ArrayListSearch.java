package arrlist;
/*
 * 学生信息搜索系统
 * 后台程序存储学生信息并展示，然后提供按照学号搜索学生信息
 * 
 * 1.定义一个学生类， 定义ArrayList存储信息， 并遍历展示出来
 * 2. 写一个方法， 接收ArrayList， 和要搜索的学号， 返回搜索学生的信息， 并展示
 * 3.使用死循环， 让用户可以不停搜索
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearch {
    public static void main(String[] args) {
        // 1.顶一个学生类， 后期用于创建对象并封装数据
        // 2. 定义一个集合对象用于装学生对象
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("id1", "AAA", 10, "class 1"));
        students.add(new Student("id2", "BBB", 11, "class 2"));
        students.add(new Student("id3", "CCC", 12, "class 3"));
        students.add(new Student("id4", "DDD", 13, "class 4"));

        // 3.遍历展示
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            System.out
                    .println(s.getStudentId() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getClassName());
        }

        // 4.让用户不断输入学号，搜索出该学生并展示出来 （独立成方法）
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please enter student ID");
            String id = sc.next();
            Student s = getStudentById(students, id);
            // 判断学号是否存在
            if (s == null) {
                System.out.println("Id not in the system");
            } else {
                System.out.println(
                        s.getStudentId() + "\t\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getClassName());
            }
        }

    }

    public static Student getStudentById(ArrayList<Student> students, String studentId) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getStudentId().equals(studentId)) {
                return s;
            }
        }
        return null;// 查无此人
    }
}
