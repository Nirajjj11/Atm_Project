
import java.util.Scanner;

public class Deposit {
    public void depositCash(DataFormat user){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount to deposit :  ₹");
        double amt = sc.nextDouble();
        user.setAmount(user.getAmount() + amt);
        System.out.println(" ₹ "+amt + "Deposited Successfully");
        System.out.println("Updated Balance is : ₹" + user.getAmount());
    }

}
