import java.util.*;
public class Task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Choose an operator(+ , -, * , /)");
        char operator = sc.next().charAt(0);
        double result;

        switch(operator){
            case '+' :
            result = a+b;
            System.out.println("Result: "+ result);
            break;
            case '-' : 
            result = a - b;
            System.out.println("Reuslt: "+result);
            break;
            case '*':
            result= a*b;
            System.out.println("Result: "+result);
            break;
            case '/':
            result = a/b;
            System.out.println("Result: "+result);
            break;
            default :
            System.err.println("Invalid operator");

        }
    }
}