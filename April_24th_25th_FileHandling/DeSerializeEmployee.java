package April_24th_25th_FileHandling;

import java.io.*;

public class DeSerializeEmployee {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\test\\DarkKnight\\serialize.txt";
        File file = new File(path);

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Employee employee = (Employee) ois.readObject();
        System.out.println(employee);
    }
}
