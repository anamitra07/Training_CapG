package Calculator_App;
import java.util.Scanner;
/*****************************
 Created by: Anamitra Kanjilal
 Date: 17-03-2025
 Time: 15:28
 ******************************/

public class CalculatorApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("**** Calculator Menu: **** \n1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Exit");
            System.out.print("Enter your input: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Calculator_Func.addMenu();
                    break;
                case 2:
                    Calculator_Func.subMenu();
                    break;
                case 3:
                    Calculator_Func.mulMenu();
                    break;
                case 4:
                    Calculator_Func.divMenu();
                    break;
                case 5:
                    flag=false;
                    System.out.println("\n Thank you for using My Calculator!!");
                    break;
                default:
                    System.out.println("\n Invalid input!!\n");
            }
        }while(flag);
    }
}
