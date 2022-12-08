import java.io.BufferedReader;
import java.io.FileReader;
public class App {
    public static void main(String[] args) throws stoopidException {

        System.out.println("A");

        //String filename= args[0];
        String filename= "example/stoopidbytes.stbc";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("File not found");
            throw new stoopidException("File not found");
        }
        
    }
}
