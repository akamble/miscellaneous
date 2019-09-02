package ioprocessing;

import java.io.File;
import java.io.FilenameFilter;

public class FileFilterExample {

    public static void main(String[] args) {

        File blobFolder = new File("/Users/akamble/Documents/BlobData/");
        File[] listOfBlobFiles = blobFolder.listFiles(new FileFilter());

        for (File file : listOfBlobFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());

                if (file.getName().equals("guidance")){
                    byte[] bytesArray = new byte[(int) file.length()];
                    //add business logic
                }

                if (file.getName().equals("route")){
                    byte[] bytesArray = new byte[(int) file.length()];
                    //add business logic
                }

            }
        }

    }
}


class FileFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
        return !name.endsWith(".DS_Store");
    }
}


