package laboratory.sedmica_7;

import java.io.*;

public class ReadFileDemo {
    public static void main(String[] args) {
        // Specify the path of the file here
        File file = new File("refreshJava\\src\\laboratory\\sedmica7\\Hello1.txt");
        BufferedInputStream bis = null;
        FileInputStream fis = null;

        try
        {
            // FIleInputStream to read the file
            fis = new FileInputStream(file);

            /* Passed the FileInputStream to BufferedInputStream
            * For Fast read using the buffer array.*/
            bis = new BufferedInputStream(fis);

            /* available() method of BufferedInputStream
            * returns 0 when there are no more bytes
            * presents in the file to be read */
            while(bis.available() > 0) {
                System.out.print((char)bis.read());
            }

        } catch (FileNotFoundException e) {
            System.out.println("The specified file not found" + e);
        } catch (IOException e) {
            System.out.println("I/O Exception: " + e);
        }
        finally {
            try{
                if(bis != null && fis != null)
                {
                    fis.close();
                    bis.close();
                }
            } catch (IOException e) {
                System.out.println("Error in InputStream close()" + e);
            }
        }
    }
}
