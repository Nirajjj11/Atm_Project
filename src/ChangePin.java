import java.util.Scanner;

public class ChangePin {
    
    public  void changePin(DataFormat user){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your new Pin :");
        int newPin = sc.nextInt();
        System.out.println("Enter again! ");
        int newPin2 = sc.nextInt();

        if (newPin == newPin2){
            user.setPin(newPin);
            System.out.println("Pin Changed Successfully.");
        }
        else{
            System.out.println("Both Pin should Same");
        }
    }
}
