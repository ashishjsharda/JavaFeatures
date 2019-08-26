package Java12;

/**
 * Lambda Expressions in Java 
 * @author asharda
 *
 */

interface TestEvenNumber{
	public boolean testEven(int n,int d);
}
public class LambdaTestEx {

	public static void main(String[] args) {

		TestEvenNumber e=(n,d)->(n%d)==0;
		System.out.println(e.testEven(10, 2));


	}

}
