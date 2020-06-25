
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int firstNumber;
        int secondNumber;
        String calculate;
        double result;

        Scanner sc=new Scanner(System.in);
        System.out.println("input first number");
        firstNumber=sc.nextInt();
        sc.nextLine();

        System.out.println("input calculate");
        calculate=sc.nextLine();

        System.out.println("input second number");
        secondNumber=sc.nextInt();

        switch(calculate){
            case "+":
                result=firstNumber+secondNumber;
                break;
            case "-":
                result=firstNumber-secondNumber;
                break;
            case "x":
                result=firstNumber*secondNumber;
                break;
            case ":":
                result=firstNumber/secondNumber;
                break;
            default:  //other case: changes t sum 2 numbers.
                result=firstNumber+secondNumber;
                calculate="+";
                break;
        }
        System.out.printf("%d %s %d =%f",firstNumber,calculate,secondNumber,result);

}}




