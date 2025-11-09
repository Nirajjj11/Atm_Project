public class DataFormat {

    private int accNo ;
    private String userName ;
    private int userCardNo;
    private int pin;
    private int age;
    private String panNo;
    private double amount ;
    private String userAddress ;
    
    // public void setAccNo(int accNo){
    //     this.accNo = accNo ;
    // }
    public int getAccNo(){
        return accNo;
    }

    public void setPin(int pin){
        this.pin = pin ;
    }
    public int getPin(){
        return pin;
    }

    // public void setUserCardNo(int userCardNo){
    //     this.userCardNo = userCardNo ;
    // }
    public int getUserCardNo(){
        return userCardNo;
    }

    // public void setUserName(String userName){
    //     this.userName = userName;
    // }
    public String getUserName(){
        return userName;
    }

    // public void setAge(int age){
    //     this.age = age;
    // }
    public int getAge(){
        return  age;
    }

    // public void setPan(String panNo){
    //     this.panNo = panNo;
    // }
    public String getPanNo(){
        return panNo;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
    
    // public void setUserAddress(String userAddress){
    //     this.userAddress = userAddress;
    // }
    public String getUserAddress(){
        return userAddress;
    }
    public DataFormat(int accNo, String userName, int userCardNo, int pin, int age, 
        String panNo, double amount, String userAddress) {
        this.accNo = accNo;
        this.userName = userName;
        this.userCardNo = userCardNo;
        this.pin = pin;
        this.age = age;
        this.panNo = panNo;
        this.amount = amount;
        this.userAddress = userAddress;
    }

}
