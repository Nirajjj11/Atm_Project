import java.util.Scanner;

public class WithDrawl{
    public static  void WithDrawlCash(DataFormat user){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Amount to withdraw .");
        double amt = sc.nextDouble();

        if(amt < 0){
            System.out.println("Invalid Amount ");
        }
        else if (amt > user.getAmount()) {
            System.out.println("Insufficient Amount");
        }
        else {
            user.setAmount(user.getAmount() - amt);
            System.out.println(" ₹ " + amt + "Withdrawl Successfull.");
            System.out.println("Remaining balance  ₹ "+ user.getAmount());
        }
        
    }
}
