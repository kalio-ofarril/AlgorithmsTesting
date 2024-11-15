package Assignments.Exercises.BasicSortingAndSearch;

import java.time.LocalTime;
import java.util.*;

/*
 * Writye an algorithm that takes two string and retgurn boolean indicating if the strings are
 * anagrams. What is the time complexity of this algorithm?
 */
public class AnagramChecker {

    public static char[] orderStringChars(String s) {
        char[] orderedChars = s.toCharArray();

        for (int i = 0; i < orderedChars.length; i++) {
            char temp = orderedChars[i];
            int j = i - 1;

            while (j >= 0 && temp < orderedChars[j]) {
                orderedChars[j + 1] = orderedChars[j];
                orderedChars[j] = temp;
                j--;
            }
        }

        return orderedChars;
    }

    public static boolean checkIfAnagram(String w1, String w2) {

        int[] charArray1 = new int[256];
        int[] charArray2 = new int[256];

        for (char c : w1.toCharArray()) {
            charArray1[c]++;
        }

        for (char c : w2.toCharArray()) {
            charArray2[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkifAnagramWithSort(String w1, String w2) {

        if (w1.length() != w2.length()) {
            return false;
        }

        return Arrays.equals(orderStringChars(w1), orderStringChars(w2));
    }

    public static void main(String[] args) {

        System.out.println(LocalTime.now());
        System.out.println(checkIfAnagram("silent", "listen"));
        System.out.println(LocalTime.now());
        System.out.println(checkifAnagramWithSort("silent", "listen"));
        System.out.println(LocalTime.now());
        System.out.println(checkIfAnagram("silenaat", "listen"));
        System.out.println(LocalTime.now());
        System.out.println(checkifAnagramWithSort("silentaaa", "listen"));
        System.out.println(LocalTime.now());
        System.out.println(checkIfAnagram("heart", "earth"));
        System.out.println(LocalTime.now());
        System.out.println(checkifAnagramWithSort("heart", "earth"));
        System.out.println(LocalTime.now());

    }

}
