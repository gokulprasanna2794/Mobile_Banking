package basic.OOPS.Abstraction;
public class Implement1 extends Additionprogram{
    @Override
    public void ArithemeticOperator(int a, int b) {
        int c=a*b;
        System.out.println(c);
    }
    @Override
    public void additional(int a, int b) {
        int data=a-b;
        System.out.println(data);
    }
    public static void main(String[] args) {
        Implement1 imple=new Implement1();
        imple.AdditionMethod(55,55);
        imple.ArithemeticOperator(55,55);
        imple.additional(1500,650);
    }
}