package April_24th_FileHandling;

import java.io.*;

public class WritingData {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\test\\DarkKnight\\demo.txt";

        File file = new File(path);

        // entering the data to write
        String message = "Would you like to have break?";

        // Method 1: Using FileOutputStream
//        FileOutputStream fos = new FileOutputStream(file, true);

        // converting written data to a byte array
//        byte[] arr = message.getBytes();
//        fos.write(arr);

        // we can skip conversion to a byte array,
        // Iterate through a for loop and print characters
//        for(int i=0;i<message.length();i++) {
//            fos.write(message.charAt(i));
//        }

        // Method 2: Using File Writer
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i=0;i<message.length();i++) {
            fw.write(message.charAt(i));
        }

        bw.flush();

        fw.flush();
        fw.close();
    }
}
