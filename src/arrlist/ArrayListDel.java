package arrlist;

import java.util.ArrayList;

public class ArrayListDel {
    public static void main(String[] args) {
        // 学习遍历， 并删除元素的正确方法
        // 1.创建一个ArrayList集合存储一个班级的学生成绩

        ArrayList<Integer> scores = new ArrayList<>();

        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);

        // 2.低于80分的成绩从集合中去掉
        /* 方法一 */
        for (int i = 0; i < scores.size(); i++) {
            int score = scores.get(i);
            if (score < 80) {
                // 删除这个分数
                scores.remove(i);
                // 删除成功后 **退后一步** 保证删除后不会跳过数据
                i--;
            }
        }
        System.out.println(scores);

        /*方法二 */
        //从后往前遍历
        for (int i = scores.size()-1; i >= 0; i--) {
            int score = scores.get(i);
            if (score < 80) {
                // 删除这个分数
                scores.remove(i);
            }
        }
        System.out.println(scores);

    }

}
