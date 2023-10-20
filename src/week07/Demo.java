package week07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //ExceptionHandling
        Scanner sc=new Scanner(System.in);
        System.out.println("code before risky");
        int arr []={1,2,3};

        try {
            //risky or dependent  statement
            int a= sc.nextInt();
            int b=sc.nextInt();
            //a,b bound ho gy is block sth,bahir unaccessible
//            System.out.println("a/b="+a/b);
//
//            System.out.println(arr[10]);

            //we can make its fun instead of this as:
            System.out.println("a/b="+A.toDivide(a,b));
        }


//        catch(ArithmeticException e)//agr uper is exception ka obj
//       // generate hoga to ye fun catch kry ga
//    {
//            System.out.println("arithmetic exception error occured");
//      }

        //isi level ki or exceptions k lie more catch statements bna skty,
        // ya ak cacth fun me OR se mulitple cases of excep with same lvl likho


        catch(InputMismatchException e){
            System.out.println("input mismatch error occured");
        }
      catch(ArrayIndexOutOfBoundsException e){
      System.out.println("arrayindexoutofbound error occured");
      }
        //parent class throwable pehle likha is me error detect ho jana,
        // nichy child class exception likha to error ay ga



        //uper 3 me se ak error aye ga to wo detect kr k finally pe ja k bahir nikl ay ga
     catch (Exception e)//ye parent class,uper mentioned  child exp me
     // agr detect ho gaia to ismy ni ay ga control,wrna idher detect
     {
    System.out.println("exception occured other than in above mentioned child classes");
     }

        finally//exception aye,na aye,ye run hoga
        {
           System.out.println("finally msg here");
        }

        System.out.println("code after risky");

    }

}
