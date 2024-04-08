package fileclassexample;
import java. io.File;
public class FileClassExample{
            public static void main(String[] args) {
                String name = "madhuri";
                File f = new File(name);
                System.out.println("File name :" + f.getName());
                System.out.println("Path: " + f.getPath());
                System.out.println("Absolute path:"
                        + f.getAbsolutePath());
                System.out.println("Parent:" + f.getParent());
                System.out.println("Exists :" + f.exists());
                }
            }


