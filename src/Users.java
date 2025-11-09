public class Users {
    public DataFormat[] users;

    public Users(){
        users = new DataFormat[]{
            new DataFormat(101, "Sam Kumar", 123456, 4321, 22, 
                        "ABCDE1234F", 1500000.50, "Patna, Bihar"),

            new DataFormat(102, "Samar Kant", 123457, 4231, 26, 
                        "ABCDE1234G", 1200000, "Gaya, Bihar")
        
        };
    }

    public DataFormat validateUser(int userCardNo, int pin){
        for (DataFormat user : users){
            if (user.getUserCardNo() == userCardNo && user.getPin() == pin){
                return user;
            }
        }
        return null;
    }
}
