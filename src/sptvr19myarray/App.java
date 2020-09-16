/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19myarray;

import java.util.Random;

/**
 *
 * @author user
 */
class App {
    public void run(){
        System.out.println("---My Array---\n"
                + "Задание:");
        System.out.println("Создайте массив из 20 случайных целых чисел.");
        System.out.println("Вычислите среднее арифметическое элементов массива \n"
                + "без учета минимального и максимального элементов массива.");
        System.out.println("Решение: ");
        System.out.println("Массив целых четных чисел");
        Random random = new Random();
        int rnum;
        rnum = 0;
        int min = 100;
        int max = 0;
        int sum = 0;
        //Создаем массив целых четных чисел
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                rnum = random.nextInt(99-0+1)+0;
                if (rnum % 2 == 0) {
                    numbers[i] = rnum;
                    break;
                }
            }
            if (numbers[i] > max)max = numbers[i];
            if (numbers[i] < min)min = numbers[i];
            sum += numbers[i];
            System.out.printf("%4d",numbers[i]);
        }
        System.out.println();
        System.out.println("Среднее арифмитическое без учёта минимального " + min + " и максимального " + max);
        System.out.printf("%3.2f ", (double)(sum-min-max)/(numbers.length - 2));
        System.out.println();
        System.out.println("---End Array---");
    }
}
