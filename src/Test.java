import java.sql.Array;
import java.time.LocalDate;
import java.util.*;

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

// Ряд чисел Фибоначи из 10 эл..  С помощью массива:
//        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Введите количество элементов ряда Фибоначи: ");
        int[] fib = new int[scanner.nextInt()];
        System.out.print("1-й элемент: ");
        fib[0] = scanner.nextInt();
        System.out.print("2-й элемент: ");
        fib[1] = scanner.nextInt();
        int sumFib = 0;
        for (int j = 0; j < fib.length - 2; j++) {
            fib[j + 2] = fib[j] + fib[j + 1];
        }
        System.out.println(Arrays.toString(fib));

        for (int j = 0; j < fib.length; j++) {
            sumFib += fib[j];
        }
        System.out.println(sumFib);
        scanner.close();

/*•	Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.*/
       String[] arr = {"123", "321", "456", "654", "789", "987", "123", "456", "789"};
       HashSet<String> numbers = new HashSet<>(Arrays.asList(arr));  // перевод массива в SET
       System.out.println(numbers);
       /*Оказывается для этого достаточно передать массив в HashSet !!!

       * А теперь РАЗВЕРНЁМ массив   */
       ArrayList<String> num = new ArrayList<>(numbers);
        Collections.reverse(num);
        /* Для такого разворота ОБЯЗАТЕЛЬНО нужно перевести массив в LIST,
        его развернуть и передать обратно!!!  */

        String[] arr1 = new String[num.size()];
       num.toArray(arr1);
        for (String el : arr1) {
            System.out.print(el + "\t");
        }
        System.out.println();
        // Еще способ развернуть массив (перебором в 2-й массив):
        int[] mass = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] ssam = new int[mass.length];
        int j = 0;
        for (int y = mass.length-1; y >=0; y--, j++) {
            ssam[j] = mass[y];
        }
        System.out.println(Arrays.toString(mass));
        System.out.println(Arrays.toString(ssam));
        System.out.println();
        // Самый оптимальный Переворот массива :
            int[] nuMber = {1, 2, 3, 4, 5, 6, 7, 8};
            reverse(nuMber);

    } // main------------------------------------------------------

        public static void reverse(int[] input) {
            System.out.println("original array : " + Arrays.toString(input));
            // handling null, empty and one element array
            if (input == null || input.length <= 1) {     // Проверка: пустой или всего 1 элемент ?
                return;
            }
            for (int i = 0; i < input.length / 2; i++) {
                int temp = input[i];  // 1-й присваеваевается tmp
                // swap numbers
                input[i] = input[input.length - 1 - i]; // 1-му присваев-ся последний
                input[input.length - 1 - i] = temp;     // Последнему присваев-ся 1-й
                // и всё сдвигается к центру в цикле.
            }
            System.out.println("reversed array : " + Arrays.toString(input));
        }
//    Book[] library = new Book[3];
//    library[0] = new Book("Как заколялась сталь", "Николай Островский.");
//    library[1] = new Book("Живые и мёртвые", "Константин Симонов");
//    library[2] = new Book("Молодая гвардия", "Александр Фадеев");
//
//        for (Book el : library) {
//        System.out.println(el);
//    }
//
//        try {
//        throw new RuntimeException();
//    } catch (Exception e) {
//        if (e instanceof IllegalArgumentException) {
//            // некоторая обработка с сужением типа (IllegalArgumentException)e
//            System.out.println("Внесите коррекировку аргумента");
//        } else if (e instanceof NullPointerException) {
//            // некоторая обработка с сужением типа (NullPointerException)e
//            System.out.println("Добавьте не пустой объект");
//        } else if (e instanceof ArithmeticException) {
//            // некоторая обработка с сужением типа (ArithmeticException)e
//            System.out.println("Деление на 0 запрещено!");
//        }
//    }
}




