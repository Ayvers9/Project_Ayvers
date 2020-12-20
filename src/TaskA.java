import java.util.Scanner;
public class TaskA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int t=scanner.nextInt();
        int a[];
        for (int i = 0; i < t; i++) {
            int n=scanner.nextInt();
            a = new int [n];

            for (int j = 0; j < n; j++) {
                a[j]=scanner.nextInt();
            }
            int pos = 0;
            for (int j = 0; j < n; j++) {
                if(j%2==0){
                    System.out.print(a[pos]+" ");
                }else{
                    System.out.print(a[n-1-pos]+" ");
                    pos++;
                }
            }
            System.out.println();
        }
    }
}