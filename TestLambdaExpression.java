/**
  * Test Lambda Expression
  * @author asharda
  *
  */
interface MyNumber
{
double getValue(int n);
}
public class TestLambdaExpression {

  public static void main(String[] args) {

    MyNumber mynum=(n)->123.45*n;
    System.out.println(mynum.getValue(10));

  }

}
