import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {


        char[] Str1 = {'п', 'р', 'и', 'в', 'е', 'т', ' ', 'м', 'и', 'р'};
        String Str2 = null;

        Str2 = Str2.copyValueOf(Str1);                         // Только для символов !
        System.out.println("Возвращаемая строка: " + Str2);

        Str2 = Str2.copyValueOf(Str1, 2, 6);
        System.out.println("Возвращаемая строка: " + Str2);

        /* Число Армстронга (Натуральное число, которое в данной системе счисления равно сумме своих цифр,
        возведённых в степень, равную количеству его цифр. )  */
        int num = 82457;

//        String s = Integer.toString(num);
//        char[] str = s.toCharArray();
//        System.out.println(Arrays.toString(str));
//        int[] numArr = new int[str.length];
//        for (int i = 0; i < s.length(); i++) {
//            numArr[i] = Integer.parseInt(str[i]);
//        }
//
//        String str = "11 343 45 23 567";
//        int summa = 0;
//        String strArr[] = str.split(" ");
//        int numArr[] = new int[strArr.length];
//        for (int i = 0; i < strArr.length; i++) {
//            numArr[i] = Integer.parseInt(strArr[i]);
//            System.out.print(numArr[i] + " ");
//            summa += numArr[i];
//        }
//        System.out.println("\n" + summa);

        String[] dhh = {"ВР","АР","ЖР","ГР","БР","ДР","ЕР"};
        Arrays.sort(dhh);                                   // сортировка по возрастанию массива СТРОК !
        System.out.println(Arrays.toString(dhh));           // ИМЕННО В ТАКОЙ ПОСЛЕДОВАТЕЛЬНОСТИ !!!!!!!!!!!!

        int[] mass = {1,2,3,4,5,17,18,19,20,6,7,8,9,10,11,12,13,14,15,16,21};
        Arrays.sort(mass);                                 // сортировка по возрастанию массива ЧИСЕЛ !
        System.out.println(Arrays.toString(mass));

    } // main ---------------------------------------------------------------

} // Class
