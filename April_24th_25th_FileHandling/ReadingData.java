package April_24th_25th_FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingData {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\test\\DarkKnight\\demo.txt";
        File file = new File(path);

        FileInputStream fis = new FileInputStream(file);

        // reading contents of demo.txt

        int x;

        while((x = fis.read()) != -1) {
            System.out.print((char) x);
        }
    }
}
