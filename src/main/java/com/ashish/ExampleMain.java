package com.ashish;

public class ExampleMain {

    public static void main(String[] args) {
        int a = 100;
        int b = 2;
        int c;
        int x[] = {1, 2, 3, 4, 5};
        float salary=1000.0f;

        System.out.println("start");

        try {


            if(b==0)
            {
                throw new ArithmeticException("divisible by 0 error");
            }
            c = a / b;
            System.out.println("C = " + c);


            if (salary < 8000.f) {

                throw new InvalidSalaryException("Salary less than 8000");
            }

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index not in range");
        }


        catch(ArithmeticException e)

        {
            System.out.println(" cant divide by 0");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("am in finally block");
        }


        System.out.println("exit");

    }
}