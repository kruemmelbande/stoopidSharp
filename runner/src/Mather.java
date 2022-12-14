public class Mather {
    public Mather(){
    }
    public double solve(double math1, double math2, String operator) throws stoopidException{
        switch(operator){
            case "+":
                return math1+math2;
            case "-":
                return math1-math2;
            case "*":
                return math1*math2;
            case "/":
                return math1/math2;
            default:
                System.out.println("Invalid math operator: " + operator);
                throw new stoopidException("Operator not handeled");
            }
    }
}
