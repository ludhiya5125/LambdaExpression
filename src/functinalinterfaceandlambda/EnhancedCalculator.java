package functinalinterfaceandlambda;
interface CalculateOperation {
    int op(int a, int b);
}
public class EnhancedCalculator
{
    static int calculate(int a,int b,CalculateOperation cal)
    {
        return cal.op(a,b);
    }
    public static void main(String[] args)
    {
        var add = calculate(2, 3, (a, b) -> a + b);
        var sub = calculate(2, 3, (a, b) -> a - b);
        var multiply = calculate(2,3,(a,b)->a*b);
        var divide=calculate(2,3,(a,b)->a/b);
        System.out.println("ADDITION :"+add);
        System.out.println("SUBTRACTION:"+sub);
        System.out.println("MULTIPLICATION:"+multiply);
        System.out.println("DIVISION:"+divide);


    }
}
