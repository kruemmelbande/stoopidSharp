public class Interpreter {
    public Interpreter()  {
       // System.out.println("Starting stoopid# interpreter");
    } 
    public void run(String[] program) throws InvalidVariable {
        //System.out.println("Running program");
        String [] splitout;
        variableHandeler varman = new variableHandeler();
        Printer printman = new Printer();
        int i =0;
        while(i< program.length){
            splitout=program[i].split(":");
            switch(splitout[1]){
                case "v":
                    varman.execute(part(2,-1,splitout));
                    break;
                case "ol":
                    printman.print(splitout[2], varman.getVars());
                    break;
                default:
                    System.out.println("Unkown keyword: "+splitout[1]);
                    break;
            }
            i++;
        }

    }
    public String [] part(int start, int stop, String[] input){
        int k=0;
        if (start<0){
            start=0;
        }
        if (stop<0){
            stop=input.length;
        }
        int len =stop-start;
        String [] output = new String[len];

        for(int i=start;i<stop;i++){
            output[k]=input[i];
            k++;
        }
        return output;
    }
    public String arrToString(String [] inp, String delim){
        String out="";
        for (String string : inp) {
            out+=string+delim;
        }
        return out;
    }
}

