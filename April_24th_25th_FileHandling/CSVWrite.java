package April_24th_25th_FileHandling;

import java.io.File;
import java.io.FileWriter;

public class CSVWrite {
    public static void main(String[] args) throws Exception{
        String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\test\\DarkKnight\\studentData.csv";
        File file = new File(path);
        file.createNewFile();

        try (FileWriter writer = new FileWriter(file)) {
            writer.append("id,name,age\n");
            writer.append("1,Rohit,25\n");
            writer.append("2,Neha,30\n");
            writer.append("3,Aarav,28\n");

            System.out.println("CSV file written successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
