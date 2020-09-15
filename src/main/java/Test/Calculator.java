package Test;

public class Calculator {



    public void add () {
        System.out.println("I am adding some numbers. ");
    }

    public void sub () {
        System.out.println("I am subtracting some numbers. ");
    }

    public void div () {
        System.out.println("I am dividing some numbers. ");
    }

    public void mul () {
        System.out.println("I am multiplying some numbers. ");
    }


    public static void main(String[] args){


          Calculator calc=new Calculator();
          calc.add();
          calc.mul();



    }
}
