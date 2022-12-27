package polymorphic_exe.exercise;

/*实现类  （子类） */

public class Keyboard implements USB{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Keyboard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        // TODO Auto-generated method stub
        System.out.println(name + " connected");
    }

    @Override
    public void unconnect() {
        // TODO Auto-generated method stub
        System.out.println(name + " disconnect");
    }

    /*
     * 独有功能
     */
    public void type(){
        System.out.println(name + " type to start");
    }

    
    
}
