import java.util.ArrayList;

public class variableHandeler {
    public static ArrayList<variable> vars;
    public variableHandeler() {
        vars=new ArrayList<variable>();
    }
    public void addVariable(String name, String value,String type) throws InvalidVariable{
        for(int i=0;i<vars.size();i++){
            if(vars.get(i).thisMe(name)){
                vars.get(i).setValue(value);
                return;
            }
        }
        variable tmp = new variable(name, type, value);
        //System.out.println(tmp.toString());
       // System.out.println(tmp.getName());
        vars.add(tmp);
    }
    public void execute(String [] command) throws InvalidVariable{
       /*  System.out.println("Interpreter has requested the following operation:");
        for (String string : command) {
            System.out.println("operation:"+string);
        }*/
        addVariable(command[1], command[2], command[0]);
        return;
    }
    public ArrayList<variable> getVars(){
        return vars;
    }
}
