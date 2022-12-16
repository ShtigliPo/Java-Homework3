package ru.gb;

/**
 * Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее арифметичское этого списка.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App 
{
    public static void main( String[] args )
    {
        List<Integer> list = randomList();
        System.out.println("Исходный список -> " + list);

        int min = list.get(0);
        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }
        System.out.printf("Min = %d\n", min);

        int max = list.get(0);
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        System.out.printf("Max = %d\n", max);

        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        double avg = sum / list.size();
        System.out.printf("AVG = %.2f\n", avg);
    }

    public static List<Integer> randomList() {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int n = random.nextInt(20) - 10;
            list.add(n);
        }
        return list;
        
    }
}
