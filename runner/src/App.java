import java.io.BufferedReader;
import java.io.FileReader;
public class App {
    private static String hash;
    public static void main(String[] args) throws stoopidException {
        //String filename= args[0];
        String filename= "examples/hello.stbc";
        String [] program;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            hash=reader.readLine();
            String tmp="";
            while ((line = reader.readLine()) != null) {
                tmp+=line + "\n";
            } 
            program= tmp.split("\n");
            //System.out.println(program[0]);
            reader.close();
        } catch (Exception e) {
            System.out.println("File not found");
            throw new stoopidException("File not found");
        }
        Interpreter interpreter= new Interpreter();
        interpreter.run(program);
        
    }
    public String  getHash(){
        return hash;
    }
}
