package fileclassexample;
 import java.io.File;
 import java.io.FileWriter;
 import java.io.IOException;

public class Fileclass {
    public static void main(String[] args) throws IOException {
        File file = new File("\"D:\\\\Final Try\\\\Core_Java\\\\src\"");
        FileWriter filewriter = new FileWriter(file);
        filewriter.write("Hi i am madhuri pharate ....");
        filewriter.close();


    }
}
