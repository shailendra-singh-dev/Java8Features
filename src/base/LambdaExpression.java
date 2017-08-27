package base;

public class LambdaExpression {

	public void testLambdaExpression(){
        IComparator iComparator= (a1,a2)-> a1>a2;
        boolean compare =iComparator.compare(100,20);
        System.out.print("compare:"+compare);
    }
       
    @FunctionalInterface
    public interface IComparator{
        boolean compare(int a1,int a2);
    }
	
}
