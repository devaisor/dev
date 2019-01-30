package Generate;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    //Переменные счетчика правильных и не правильных ответов.
    public int countTrue = 0;
    public int countErr = 0;

    MyRandom rand = new MyRandom();

    // Переменные
    public int rez; //Переменная результата
    //Метод запуска программы. Точка входа
    public void run() {

        System.out.println("Введите кол-во генерируемых примеров.");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 1;
        int i = 1;
        while (i <= number) {
            System.out.println("Пример №: " + count);
            getOperation();
            count++;
            i++;
// if (count == number){
// System.out.println("Всего решено: " + number + "Решено правильно: " + countTrue + ", решено неправильно: " + countErr);
// }
        }
    }
    //Операции с переменными
    void getOperation() {
        String chars = "+-/*";
        Random rnd = new Random();
        char type = chars.charAt(rnd.nextInt(chars.length()));
        switch (type) {
            case '*': umn();
                break;
            case '/': delenie();
                break;
            case '+': summ();
                break;
            case '-': razn();
                break;
        }
    }
    // Метод сложения чисел
    public void summ() {
        System.out.println("Пример на сложение.");
        int num1 = rand.randNum100();
        int num2 = rand.randNum100();
        rez = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " );
        setRez();
    }
    // Метод вычитания чисел
    public void razn() {
        System.out.println("Пример на разность.");
        int num1 = rand.randNum100();
        int num2 = rand.randNum100();
        if (num1 > num2){
            rez = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " );
            setRez();} else {rez = num2 - num1;
            System.out.println(num2 + " - " + num1 + " = " );
            setRez();
        }
    }
    // Метод деления чисел
    public void delenie() {
        System.out.println("Пример на деление.");
        int num1 = rand.randNum10();
        int num2 = rand.randNum10();
        rez = num1 * num2;
        System.out.println(rez + " / " + num2 + " = " );
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Правильный ответ: " + num1);
        if (num1 == number) {
            countTrue++;
            printRez();
        }
        else {
            countErr++;
            printRez();
        }
    }
    // Метод умножения чисел
    public void umn() {
        System.out.println("Пример на умножение.");
        int num1 = rand.randNum10();
        int num2 = rand.randNum10();
        rez = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " );
        setRez();
    }
    //Метод сравнение результатов ввода ответов
    public void setRez() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Правильный ответ: " + rez);
        if (rez == number) {
            countTrue++;
            printRez();
        }
        else {
            countErr++;
            printRez();
        }
    }
    //Метод вывода результатов ответов правильно /не правильно
    public void printRez(){
        System.out.println("Решено правильно: " + countTrue + ", решено неправильно: " + countErr);
    }
    public void totalRezult(){
// System.out.println("Всего решено: " + number + "Решено правильно: " + countTrue + ", решено неправильно:" + countErr);
    }

}