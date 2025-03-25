package March_22nd_Encapsulation;

public class NetBankDriver {
    public static void main(String[] args) {
        NetBank b = new NetBank();
        b.getBalance(1234);
        b.addBalance(5000,1234);
        b.getBalance(1234);
        b.withdraw(10000,1234);
        b.getBalance(1234);
    }
}

// Student Mgmt System: Update and fetching the student, private == email and password, name, age, gender, branch
// make all member private
// every time you update the info.