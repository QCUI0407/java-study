package polymorphic_exe.exercise;

/*实现类  （子类） */

public class Mouse implements USB{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mouse(String name) {
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
    public void click(){
        System.out.println(name + " click to start");
    }

    
    
}
