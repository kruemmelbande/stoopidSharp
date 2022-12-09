import java.util.ArrayList;

public class Printer {
    public Printer(){}
    public void print(String Var, ArrayList<variable> vars){
        //System.out.println("Printing:");
        for (variable s : vars) {
            if (s.thisMe(Var)){
                System.out.println(s.toString());
                return;
            }

        }
        System.out.println("var not found: " + Var);
    }
    
}
