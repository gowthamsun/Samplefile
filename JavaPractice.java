package for2;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args){
        sample a=new sample();
        a.Bankdetails();
    }
}
class sample{
    String name= "Ram";
    long AccountBalance=1000;
    String Accounttype="Saving";
    //Scanner c =new Scanner(system.in)
    public void Bankdetails(){
        System.out.println("Name:"+name);
                System.out.println("AccountBalance:"+AccountBalance);
        System.out.println("Accounttype:"+Accounttype);

    }

}
