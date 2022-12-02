import java.time.LocalDate;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи число : ");
        //String s = scanner.nextLine();

//        try {
            // именно здесь String преобразуется в int
            int i = Integer.parseInt(scanner.nextLine().trim());

            // выведем на экран значение после конвертации
            System.out.println("int i = " + i);
//        } catch (NumberFormatException nfe) {
//            System.out.println("NumberFormatException: " + nfe.getMessage());
//        }
        System.out.print("Введите дату (yyyy-MM-dd) для получения на неё списка задач: ");
        LocalDate localDate = LocalDate.parse(scanner.nextLine());
        System.out.println(localDate);
    }

}
