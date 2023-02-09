import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            System.out.println("Inserire una parola: ");
            Scanner scanner = new Scanner(System.in);
            String richiesta =scanner.nextLine();
            switch (richiesta) {
                case "size":
                    System.out.println(list.size());
                    break;
                case "clear":
                    list.clear();
                    break;
                case "print":
                    System.out.println(list);
                    break;
                default:
                    list.add(richiesta);
                    break;
            }

        }
    }
}
