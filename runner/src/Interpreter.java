public class Interpreter {
    public Interpreter()  {
        System.out.println("Starting stoopid# interpreter");
    } 
    public void run(String[] program) {
        System.out.println("Running program");
        String [] splitout;
        for (int i=0; i<program.length; i++) {
            splitout=program[i].split(":");
        }
    }
}

