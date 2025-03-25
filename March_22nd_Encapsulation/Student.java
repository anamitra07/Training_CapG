package March_22nd_Encapsulation;

public class Student {
    private String name = "Raj";
    private String gender = "male";
    private String stream = "CSE";
    private int age = 20;
    private String email = "abc@gmail.com";
    private int pwd = 1234;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPwd(String email,int pwd) {
        if(this.email.equals(email)) {
            this.pwd = pwd;
        }
    }

    public void updatePwd(String email,int pwd, int new_pwd) {
        if(this.email.equals(email) && (this.pwd == pwd)) {
            this.pwd = new_pwd;
        }
    }

    public void getPwd(String email) {
        if(this.email.equals(email)) {
            System.out.println("Your Password is: " + this.pwd);
        }
    }

    public void setName(String email, int pwd, String name) {
        if(this.email.equals(email) && this.pwd == pwd) {
            this.name = name;
        }
        else {
            System.out.println("Invalid credentials!! ");
        }
    }

    public void getName(String email, int pwd) {
        if(this.email.equals(email) && this.pwd == pwd) {
            System.out.println("Your name is: " + this.name);
        }
        else {
            System.out.println("Invalid Credentials!!");
        }
    }

    public void setAge(String email, int pwd, int age) {
        if(this.email.equals(email) && this.pwd == pwd) {
            this.age = age;
        }
        else {
            System.out.println("Invalid credentials!! ");
        }
    }

    public void getAge(String email, int pwd) {
        if(this.email.equals(email) && this.pwd == pwd) {
            System.out.println("Your age is: " + this.age);
        }
        else {
            System.out.println("Invalid Credentials!!");
        }
    }

    public void setGender(String email, int pwd, String gender) {
        if(this.email.equals(email) && this.pwd == pwd) {
            this.gender = gender;
        }
        else {
            System.out.println("Invalid credentials!! ");
        }
    }

    public void getGender(String email, int pwd) {
        if(this.email.equals(email) && this.pwd == pwd) {
            System.out.println("Your gender is: " + this.gender);
        }
        else {
            System.out.println("Invalid Credentials!!");
        }
    }

    public void setStream(String email, int pwd, String stream) {
        if(this.email.equals(email) && this.pwd == pwd) {
            this.stream = stream;
        }
        else {
            System.out.println("Invalid credentials!! ");
        }
    }

    public void getStream(String email, int pwd) {
        if(this.email.equals(email) && this.pwd == pwd) {
            System.out.println("Your stream is: " + this.stream);
        }
        else {
            System.out.println("Invalid Credentials!!");
        }
    }
}
