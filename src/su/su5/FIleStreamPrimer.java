package su.su5;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FIleStreamPrimer {
    public static void main(String[] args) {
        try {
            byte[] array = {1,2,3,4,5};
            OutputStream os = new FileOutputStream("test.txt");
            for(int i=0; i<array.length; i++){
                os.write(array[i]);
            }
            os.close();
        }
    }
}
