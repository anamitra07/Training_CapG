package April_3rd_CustomException;

public class UserLogin {
    private int pin = 1234;

    public void login(int pin) throws InvalidPinException {
        if(this.pin == pin) {
            System.out.println("User successfully logged in");
        }
        else {
            throw new InvalidPinException("User pin is invalid");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        UserLogin user = new UserLogin();
        try {
            user.login(1224);
        }
        catch(InvalidPinException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main end");
    }
}

//Here, first Exception is thrown and then it is handled, using try catch block.