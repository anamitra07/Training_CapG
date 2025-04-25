package April_24th_25th_FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\test\\DarkKnight\\serialize.txt";
        File file = new File(path);

        file.createNewFile();

        Employee employee = new Employee(1,"Rohit",26);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream ous = new ObjectOutputStream(fos);

        ous.writeObject(employee);
        ous.flush();

        ous.close();
        fos.close();
    }
}
