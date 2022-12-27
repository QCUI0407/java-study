package polymorphic_exe.anonymous_inner;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * 通过GUI编程 【GUI（图形用户界面）编程指的是使用图形元素（如按钮、菜单、文本框等）来创建用户界面的编程】
 * 理解匿名内部类的真实使用场景
 */
public class example1 {
    public static void main(String[] args) {
        //1.创建窗口
        JFrame win = new JFrame("Login interface");
        JPanel panel = new JPanel();//因为按钮占满整个窗口，设置一个桌布可以自布局
        win.add(panel);

        //2.创建一个按钮对象
        JButton btn = new JButton("LOGIN");


        /*
         * ***匿名内部类使用
         */
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "easy click!!"));
        btn.addActionListener(new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(win,"click click");
            }
            
        });


        //3. 把按钮对象添加到**桌布**展示
        panel.add(btn);

        //4.展示窗口
        win.setSize(400, 300);//窗口宽高
        win.setLocationRelativeTo(null);//居中显示
        win.setVisible(true);//展示
    }
}
