
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc= new Scanner(System.in);

        Users allUsers = new Users();

        System.out.println("== Welcome to ATM Project ==");
        System.out.println("\nEnter Your Card and pin");
        int cardNo = sc.nextInt();
        int pin = sc.nextInt();
        
        DataFormat currentUser = allUsers.validateUser(cardNo , pin);

        if (currentUser != null) {
            System.out.println("\nLogin Successful!");
            System.out.println("-----------------  Welcome, " + currentUser.getUserName()+ " ------------------");
            Dashboard dashboard = new Dashboard();          // Object for dashboard 
            dashboard.DisplayDashobard(currentUser);                   // calling function of dashboard
        } else {
            System.out.println("\n Invalid Card Number or PIN!");
        }
        sc.close();
    }
}
