package abstract_exercise.template_exe;

//理解模板方法模式的思想和使用步骤

public class test {
    public static void main(String[] args) {
        MiddleSchool m = new MiddleSchool();
        m.write();

        HighSchool h = new HighSchool();
        h.write();;
    }
}
