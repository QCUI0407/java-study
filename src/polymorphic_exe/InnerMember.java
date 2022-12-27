package polymorphic_exe;

public class InnerMember {
    public static void main(String[] args) {
        People.Heart heart = new People(). new Heart();
        heart.show();
    }
}

class People{
    private int heartbeat = 100;
    /*
     * 成员内部类
     */

    public class Heart{
        private int heartbeat = 50;

        public void show(){
            int heartbeat = 10;
            System.out.println(heartbeat); //10
            System.out.println(this.heartbeat); //50
            System.out.println(People.this.heartbeat);//100
        }
    }
}
