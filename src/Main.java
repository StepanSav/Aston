import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        printThreeWorld();
        checkSumSign();
        printColor();
        compareNumbers();
        checkSumInRange();
        checkPositiveOrNegative();
        boolean negative = isNegative();
        printStringMultipleTimes("Строка", 5);
        System.out.println(isLeapYear(2001));
        invertArray(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
        fillArrWithSequence();
        multiplyLessThanSix();
        fillDiagonalArray();
        int[] resultArray = createArray(5, 10);
        System.out.println(Arrays.toString(resultArray));

    }

    //Задание 1

    public static void printThreeWorld() {
        System.out.println("\nЗадание 1:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");


    }

    // Задание 2

    public static void checkSumSign() {


        int a = 3;
        int b = 5;
        int sum = a + b;

        System.out.println("\nЗадание 2: ");

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //Задание 3

    public static void printColor() {

        System.out.println("\nЗадание 3:");

        int value = 3;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    //Задание 4

    public static void compareNumbers() {

        int a = 3;
        int b = 5;

        System.out.println("\nЗадание 4:");

        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    //Задание 5

    public static void checkSumInRange() {

        System.out.println("\nЗадание 5:");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scan.nextInt();

        int res;

        //scan.close();

        res = num1 + num2;

        if (res >= 10 && res <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    //Задание 6

    public static void checkPositiveOrNegative() {

        System.out.println("\nЗадание 6:");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num1 = scan.nextInt();

        if (num1 >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
//Задание 7

    public static boolean isNegative() {

    System.out.println("\nЗадание 7:");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num1 = scan.nextInt();

        if (num1 >= 0) {
            System.out.println("true");
        } else {
            System.out.println("false ");
        }
         return false;
        }

//Задание 8

    public static void printStringMultipleTimes(String str, int times){

        System.out.println("\nЗадание 8:");

        if (times < 0) {
            System.out.println("Количество повторений не может быть отрицательным.");
            return;
        }
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

//Задание 9

    public static boolean isLeapYear(int year) {

        System.out.println("\nЗадание 9:");

        boolean b = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return b;
    }

//Задание 10

    public static void invertArray(int[] arr) {

        System.out.println("\nЗадание 10:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
            System.out.print(arr[i] + " ");
        }
    }

//Задание 11

    public static void fillArrWithSequence(){

        System.out.println("\nЗадание 11:");

        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++){

            arr[i]= i + 1;
            System.out.print(arr[i] + " ");
        }
    }

//Задание 12
    public static void multiplyLessThanSix() {

        System.out.println("\nЗадание 12:");

        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 11};

        for (int i =0; i < arr.length; i++) {
            if (arr[ i ] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }

//Задание 13

    public static void fillDiagonalArray() {

        System.out.println("\nЗадание 13:");

        int size = 4;
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

//Задание 14

    public static int[] createArray(int len, int initialValue) {

        System.out.println("\nЗадание 14:");

        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}

//System.out.println("\nЗадание 13:");




