package interface_implements;

public class FootballPlayer implements Sportsman, Rule {
    private String name;
    public FootballPlayer(String name){
        this.name = name;
    }
    @Override
    public void rule() {
        // TODO Auto-generated method stub
        System.out.println(name + " obey the rules");
        
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(name + " run 3 miles");
        
    }
    @Override
    public void pushup() {
        // TODO Auto-generated method stub
        System.out.println(name + " do 30 pushup in 1 min");
        
    }
    
}
