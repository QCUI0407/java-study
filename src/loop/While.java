package loop;
public class While {
    public static void main(String[] args) {
        //不知道要循环多少次所以使用while循环
        //需求：山高度8848860 mm， 纸张厚度0.1， 折叠多少次知道不低于山高
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        //定义次数
        int count = 0;
        while(paperThickness<peakHeight){
            paperThickness *=2;
            count++;
        }
        System.out.println("Times for fold: " + count);
        System.out.println("paper thickness: " + paperThickness);
    }
}
