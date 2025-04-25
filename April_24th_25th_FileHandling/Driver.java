package April_24th_25th_FileHandling;

import java.io.File;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {

        // specifying a folder inside path 'Desktop', named FileHandlingKolkata
//        String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\test\\demo";

        // setting path for renaming folder
//        String renamePath = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\test\\DarkKnight";

        // create a new file demo.txt;
        String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\test\\DarkKnight\\demo.txt";
        File file = new File(path);
//        File rename = new File(renamePath);

        // creating the folder
//        file.mkdir();
//        file.mkdirs();

        // rename
//        System.out.println(file.renameTo(rename));

        // deleting the folder demo
//        file.delete();

        // Create a text file inside darkKnight
//        file.createNewFile();

        System.out.println(file.canRead());
        System.out.println(file.canWrite());
    }
}

// mkdir() -> creates one folder
// mkdirs() -> creates many folders