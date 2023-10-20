package week07;

public class A {

   //exception ko method me handle kr rhy instead of main
   public static int toDivide(int c,int d)
    //is me int return hona to wo as var string le ga hi ni so no input exp error
    {
        int result;
        try { //risky  part
            result = c / d;
        } catch (ArithmeticException e) {
            System.out.println("arithmetic excep occured");
            result = 0;
        }
        return result;
    }
    int a;
    //checked excep ko bypass krny k lie declare kr rhy exp
    public A (int a) throws IllegalAccessException
    { //throws as a declaration that we are responsible for this error
        if (a<0){
            throw new IllegalAccessException();
            //throw mtlb khud se exp bnai
    }
    this.a=a ;

}
    }
