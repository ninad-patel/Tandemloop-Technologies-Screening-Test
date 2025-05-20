import java.util.*;
public class Problem1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no.: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter an operator(+,-,*/): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter Second no.: ");
        double n2 = sc.nextDouble();
        Solve s = new Solve(n1,n2,op);
        if (s.operator == '+'){
            System.out.println("Ans:- " + s.add());
        }
        else if (s.operator == '-'){
            System.out.println("Ans:- " + s.substract());
        }
        else if (s.operator == '*'){
            System.out.println("Ans:- " + s.multiply());
        }
        else if (s.operator == '/'){
            System.out.println("Ans:- " + s.divide());
        }
        else {
            System.out.println("The operator is invalid!!! Please choose one of them(+,-,*,/)");
        }
    }
}
class Solve {
    double a;
    double b;
    char operator;

    Solve(double n1, double n2, char op) {
        this.a = n1;
        this.b = n2;
        this.operator = op; 
    }
    double add() {
        return this.a + this.b;
    }
    double substract() {
        return this.a - this.b;
    }
    double multiply() {
        return this.a * this.b;
    }
    double divide() {
        return this.a / this.b;
    }
}