package March_27th_Polymorphism_Task2;

public class Professor extends Person{
    private String specialization;

    public Professor(String name, int age,String specialization) {
        super(name,age);
        this.specialization = specialization;
    }

    public void displayProfessorInfo() {
        System.out.println("Student id: " + this.studentId);
        super.displayInfo();
    }
}
