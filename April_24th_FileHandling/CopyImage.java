package April_24th_FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class CopyImage {
    public static void main(String[] args) throws Exception {

        // create a file with same image format in destination folder
        String destinationPath = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\test\\DarkKnight\\image.jp  g";
        File destinationFile = new File(destinationPath);
        destinationFile.createNewFile();

        // we need to read data to input stream
        String sourcePath = "C:\\Users\\User\\Downloads\\OIP.jpg";
        File sourceFile = new File(sourcePath);

        // reading data from source image
        FileInputStream fis = new FileInputStream(sourceFile);

        /* First way to take image:
            i) convert image to pure byte array
         */

        byte[] arr = new byte[(int) sourceFile.length()]; // getting the size of the array
        fis.read(arr); // reads data from sourcefile and stores in byte array

        // writing data
        FileOutputStream fos = new FileOutputStream(destinationFile);
        fos.write(arr);

        // closing i/o streams
        fis.close();
        fos.close();
    }
}
