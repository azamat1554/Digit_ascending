package com.azamat;

/**
 * Находит все числа, разряды у которых расположены в порядке неубывания начиная со старшего.
 */
public class DigitAscendign {
    public static void main(String[] args) {
        long N = 1_000_000l;


        for (long i = 1; i < N; i++) {
            if (checkNumber(i)) System.out.println(i);
        }
    }

    //метод, в котором число проверяется на заданное условие
    static boolean checkNumber(long number) {
        long integer = number;
        int rest, prev = 9;

        do {
            rest = (int) integer % 10; //остаток от деления
            if (rest <= prev) { //проверка - является ли разряд не больше предыдущего
                prev = rest;
            } else return false; //если нет - выход из метода

            integer = (int) integer / 10; //целая часть от деления
            if ((integer < 10) && (integer <= prev)) { //когда от исходного числа number остается один разряд (т.е. страрший разряд),
                return true;                           //проверяем является ли он не больше предыдущего
            }
        } while (true);
    }

}
