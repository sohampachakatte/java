package OOPS;


public class program {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object called p1

        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        BankAccout myAccout = new BankAccout();
        myAccout.username = "sohampachkatte";
        // myAccout.password // error;
        myAccout.setPassword("soham96200");
        System.out.println(myAccout.getPass());
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}

class Student {
    String name;
    int age;
    float percentage; // cgpa

    void claPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}


class BankAccout{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
    public String getPass(){
        return password;
    }




}
