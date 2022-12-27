package polymorphic_exe.exercise;
/**
 * USB设备模拟
 * 1.定义USB接口： 插入 & 拔出
 * 2.定义两个实现类： 鼠标 & 键盘
 * 3. 创建一个电脑对象， USB设备对象， 安装启动
 */

public class Test {
    public static void main(String[] args) {
        //a. 创建电脑对象
        Computer c = new Computer();
        //b. 创建USB对象
        USB u = new Mouse("HP");
        c.installUSB(u);

        USB k = new Keyboard("DELL");
        c.installUSB(k);
    }
}
