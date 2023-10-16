package GuessTheNumberGame;

class EMploy {
    private int id;
    private String name;

    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
}

public class GetterandSetter {

    public static void main(String[] args) {

        EMploy john = new EMploy();
        john.setId(12);
        System.out.println(john.getId());
        john.setName("KING");
        System.out.println(john.getName());
    }

}
