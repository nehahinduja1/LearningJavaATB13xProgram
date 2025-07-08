package ex_21_OOPs_Encapsulation;

public class Lab190_REAL_Bank {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 100);
        long bal = amit.getBal();
        System.out.println(bal);
        amit.setBal(500,true);
        long bal2 = amit.getBal();
        System.out.println(bal);
    }
}
class ICICIBank {
    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the Bal");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}