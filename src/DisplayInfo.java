public class DisplayInfo {
    public  void displayUserInfo(DataFormat user){
        System.out.println("======== Your Informaiton ========");
        System.out.println("Account no : "+ user.getAccNo());
        System.out.println("Name : " +user.getUserName());
        System.out.println("Age : "+user.getAge());
        System.out.println("PAN : "+ user.getPanNo());
        System.out.println("Address : " + user.getUserAddress());
        System.out.println("Balance : " + user.getAmount());
    }
    
}
