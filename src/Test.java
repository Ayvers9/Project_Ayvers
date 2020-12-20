import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите путь к файлу");
        String str = scanner.nextLine();
        File ima = new File(str);
        while(!ima.exists()){
            System.out.println("Попробуй ещё раз");
            str =scanner.nextLine();
            ima = new File(str);
        }

    }
}
