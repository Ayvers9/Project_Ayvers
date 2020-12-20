import java.util.Scanner;

public class inforB {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((int)Math.ceil(Math.log(n)/Math.log(2)));
    }
}
