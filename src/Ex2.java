import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] b = a.split(" ");
        int[] letters = new int[32];

        for (int i = 0; i < b.length; i++) {
            letters[Character.toLowerCase(b[i].charAt(0)) - 1072]++;
        }
        for (int i = 0; i < 32; i++) {
            System.out.println((char) (i + 1072));

        }

    }

}
