package abdulrahmansaleh_streamdemo;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Abdul Rahman Saleh
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        try {
            String namaFile = "abdulrahmansaleh-outputstream.txt";
            
            //tujuan file menyesuaikan direktori masing-masing perangkat 
            String destinationFile = "C:\\Java Projects\\AbdulRahmanSaleh_StreamDemo\\file-txt-stream\\"+ namaFile;
            String isiFile = "--------------------------------------\nINI ADALAH HASIL PROSES OUTPUT STREAM\n--------------------------------------\nNama : Abdul Rahman Saleh\nNIM  : 1931710038\nAbsen: 01\nKelas: MI3F\n";
            
            /** ---------------------------------- jawaban TUGAS --------------------------------------------
             * menambahkan parameter TRUE untuk melakukan proses appending(penambahan konteks file) 
             * ketika program dijalankan ulang dengan tujuan file yang sama seperti pada kode berikut:
             ----------------------------------------------------------------------------------------------*/
            OutputStream os = new FileOutputStream(destinationFile, true); 
            
            /**----------------------------------------------------------------------------------------------
             * nb:
             * Ketika inisialiasi output stream tidak ditambahkan parameter TRUE, maka proses output stream 
             * akan mengikuti defaultnya yaitu bersifat FALSE dimana konteks file akan tertimpa dengan 
             * yang baru saat program dijalankan ulang dengan tujuan file yang sama.
             -----------------------------------------------------------------------------------------------*/
            System.out.println("Ini adalah Proses Output Stream. Silahkan cek file.\nJika ingin menambah isi file, Silahkan jalankan ulang program.");
            int i=0;
            while(isiFile.length()!=-1){
                os.write((byte)isiFile.charAt(i));
                os.flush();
                i++;
            }
            
            os.close();
        } catch (Exception e) {
        }
    }
}
