import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int [] a  =new int[n];
        for (int i = 0; i < n/2; i++) {
        a[i]=scanner.nextInt();
        int b ;
        a[2*i]=a[i];
        }
        int i=n-1;
        int j=1;
        while(i>=n/2){
            a[j]= a[i--];
            j+=2;
        }
        }
    }

