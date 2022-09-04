import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // 외부 입력을 받을 수 있는 Scanner 객체 생성
        System.out.println("첫 번째 숫자를 입력하세요.");
        String str1 = scan.nextLine(); // 첫 번째 숫자 입력

        System.out.println("사칙연산자를 입력하세요.");
        String op = scan.nextLine(); // 사칙연산자 입력

        System.out.println("두 번째 숫자를 입력하세요.");
        String str2 = scan.nextLine(); // 두 번째 숫자 입력

        int num1=Integer.parseInt(str1);
        int num2=Integer.parseInt(str2);

        int result = 0;
        if (op.equals("+")){
            result=num1+num2;
        }
        if (op.equals("-")){
            result=num1-num2;
        }
        if (op.equals("*")){
            result=num1*num2;
        }
        if (op.equals("/")){
            result=num1/num2;
        }

        System.out.println(str1 + " " + op + " " + str2 + " = " + result);
    }
}
