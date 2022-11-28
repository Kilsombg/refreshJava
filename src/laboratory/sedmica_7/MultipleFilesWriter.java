package laboratory.sedmica_7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class MultipleFilesWriter {
    public final static String WEB_ENV = "@WEBENV";
    public final static String SQL_ENV = "@SQLENV";
    public final static String TOEMAIL = "@TOEMAIL";
    public final static String RB_VERSION_FILE = "@VV";
    public final static String RB_VERSION = "@VV";

    public static Properties prop = new Properties();

    // method responsible for searching the target String in file
    // public static void lookIn(Path path, String web,)

    public static void main(String[] args) {
        String configFilePath = "E:\\Programming\\Java\\refreshJava\\src\\laboratory\\sedmica7\\config.properties";

        try {
            FileInputStream propsInput = new FileInputStream(configFilePath);
            MultipleFilesWriter.prop.load(propsInput);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Something is wrong with the config file.");
        }

        String name = prop.getProperty("NAME");
        String age = prop.getProperty("AGE");

        Path functionalPath = Paths.get("E:\\Programming\\Java\\refreshJava\\src\\laboratory\\sedmica7\\properties.txt");
        String text = name + age;
        try {
            Files.write(functionalPath, text.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(name);
        //  System.out.println(age.getClass());
    }
}
