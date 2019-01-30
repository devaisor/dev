package Generate;

public class MyRandom {
    //Генератор чисел от 1 до 100
    public int randNum100() {
        int num = (int) (Math.random() * 100) + 1;
        return num;
    }
    //Генератор числа от 1 до 10 для деления и умножения "Телефон рыжего-)) 9534756379 9298547817
    public int randNum10() {
        int num = (int) (Math.random() * 10) + 1;
        return num;
    }
}