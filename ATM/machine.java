package ATM;

public class machine {
    private int balance;

    machine(int balance){
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withDraw(int amount){
        if(amount > balance){
            System.out.println("Insufficent funds");
        }else{
            balance -= amount;
        }
    }

    public int showBalance(){
        return balance;
    }
}
