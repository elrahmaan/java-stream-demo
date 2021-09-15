package abdulrahmansaleh_streamdemo;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Abdul Rahman Saleh
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        try {
            String namaFile = "abdulrahmansaleh-inputstream.txt";
            
            //tujuan file menyesuaikan direktori masing-masing perangkat 
            String destinationFile = "C:\\Java Projects\\AbdulRahmanSaleh_StreamDemo\\file-txt-stream\\" + namaFile;
            InputStream is = new FileInputStream(destinationFile);
            int data = is.read();
            while(data!=-1){
                System.out.write(data);
                data = is.read();
            }
            is.close();
        } catch (Exception e) {
        }
    }
}
