
import java.util.Scanner;

public class Dashboard {
    Scanner sc = new Scanner(System.in);
    public void DisplayDashobard(DataFormat user){
        
        while (true) {  
            System.out.println("\n===============================");
            System.out.println("1. for Withdrawl");
            System.out.println("2. for Balance Enquiry");
            System.out.println("3. for Get your Info");
            System.out.println("4. for Change Pin");
            System.out.println("5. for Deposit");
            System.out.println("6. for exit");
            System.out.println("\n===============================");
            System.out.println("Choose the option to get Services : -");
            
            int option = sc.nextInt();

            switch (option) {
                case 1 -> WithDrawl.WithDrawlCash(user);
                case 2 -> System.out.println("💰 Your current balance: ₹" + user.getAmount());
                case 3 -> {
                    DisplayInfo info = new  DisplayInfo();
                    info.displayUserInfo(user);
                }
                case 4 -> {
                    ChangePin cp = new ChangePin();
                    cp.changePin(user);
                }
                case 5 -> {
                    Deposit dp = new Deposit();
                    dp.depositCash(user);
                }
                case 6 -> {
                    System.out.println("Thanku "+ user.getUserName()+ " ! visit Again.");
                    return;
                }
                default -> System.out.println("Invalid Option ! Try again.");
            }
        }
    }
    
}
