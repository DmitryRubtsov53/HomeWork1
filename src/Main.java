import java.io.FileNotFoundException;
import java.security.InvalidParameterException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задачи Лайи-кодинга к Билету №7 Теоретической части Курсовой №2.........................");

        System.out.println("\n Задача 1. Массив пар (название и автор книги). \n");

    Book[] library = new Book[3];
    library[0] = new Book("Как заколялась сталь", "Николай Островский.");
    library[1] = new Book("Живые и мёртвые", "КонстантинСимонов");
    library[2] = new Book("Молодая гвардия", "Александр Фадеев");

        for (Book el : library) {
            System.out.println(el);
        }

        System.out.println("\n Задача 2. Пример обработки нескольких исключений в 1-ом блоке catch. \n");

        try {
            throw new RuntimeException();
        } catch (Exception e) {
            if (e instanceof IllegalArgumentException) {
                // некоторая обработка с сужением типа (IllegalArgumentException)e
            } else if (e instanceof NullPointerException) {
                // некоторая обработка с сужением типа (NullPointerException)e
            } else if (e instanceof ArithmeticException) {
                // некоторая обработка с сужением типа (ArithmeticException)e
            }
        }




    } // main -----------------------------------------------------------------


} // Class