package abstract_exercise.template_exe;

public abstract class School {
    /*
     * 正式： 声明了模板方法模式
     */
    public final void write() {
        System.out.println("everyone do this function--line 1");
        System.out.println("everyone do this function--line 2");
        /*
         * 每个子类都要运行这个方法，但是内容不同，因此：模板方法把这部分代码定义成抽象代码，交给具体子类完成
         */
        System.out.println(writeMain());//子类自己写内容

         System.out.println("everyone do this function--line 3");
    }
    public abstract String writeMain();
}
