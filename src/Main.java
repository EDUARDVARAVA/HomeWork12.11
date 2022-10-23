import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int countAllHenMonth = 0;
        int getCountOfEggsPerYearR = 0;
        int getCountOfEggsPerYearU = 0;
        int getCountOfEggsPerYearM = 0;
        int getCountOfEggsPerYearB = 0;
        int countHenR = 0;
        int countHenU = 0;
        int countHenM = 0;
        int countHenB = 0;
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(4) + 1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                countAllHenMonth += 5;
                getCountOfEggsPerYearR += 5;
                countHenR += 1;
            } else {
                if (array[i] == 2) {
                    countAllHenMonth += 10;
                    getCountOfEggsPerYearU += 10;
                    countHenU += 1;
                } else {
                    if (array[i] == 3){
                        countAllHenMonth += 15;
                        getCountOfEggsPerYearM += 15;
                        countHenM += 1;
                    } else {
                        if (array[i] == 4){
                            countAllHenMonth += 20;
                            getCountOfEggsPerYearB += 20;
                            countHenB += 1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Яиц снесённых за год = " + countAllHenMonth * 12);
        System.out.println("Русских куриц = " + countHenR + " шт. Снесено за год: " + getCountOfEggsPerYearR * 12 + " яиц.");
        System.out.println("Украинских куриц = " + countHenU + " шт. Снесено за год: " + getCountOfEggsPerYearU * 12 + " яиц.");
        System.out.println("Молдавских куриц = " + countHenM + " шт. Снесено за год: " + getCountOfEggsPerYearM * 12 + " яиц.");
        System.out.println("Беларусских куриц = " + countHenB + " шт. Снесено за год: " + getCountOfEggsPerYearB * 12 + " яиц.");

    }
}