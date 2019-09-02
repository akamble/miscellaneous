import com.here.nds.hdlm.qa.cmp.core.util.BinaryNdsFileType;
import com.here.nds.hdlm.qa.cmp.run.Launcher;

import java.io.File;
import java.io.FilenameFilter;



public class ComparisonExample {





    public static void main(String[] args) {

        File blobFolder = new File("/Users/akamble/Documents/BlobData/");
        File[] listOfBlobFiles = blobFolder.listFiles(new FileFilter());

        Launcher.CompareScope compareScope = null;

        for (File file : listOfBlobFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());

                if (file.getName().equals("guidance")){
                    byte[] bytesArray = new byte[(int) file.length()];
                    compareScope.addPayload(BinaryNdsFileType.guidanceData,bytesArray);
                }

                if (file.getName().equals("guidance")){
                    byte[] bytesArray = new byte[(int) file.length()];
                    compareScope.addPayload(BinaryNdsFileType.guidanceData,bytesArray);
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


