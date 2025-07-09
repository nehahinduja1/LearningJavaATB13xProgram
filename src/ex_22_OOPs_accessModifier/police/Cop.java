package ex_22_OOPs_accessModifier.police;

public class Cop {
    public int gun;
    private String iCard;

    public Cop(int bullet) {
        this.gun = bullet;
    }


    //Method and Behav
     protected void CanIshoot() {   // default
        System.out.println("Yes you can !!");
    }

     void thisdefaultF1() {
        System.out.println("Hi, Cop!");
    }

}
