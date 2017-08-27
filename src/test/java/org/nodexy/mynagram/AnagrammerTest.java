package org.nodexy.mynagram;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.swing.*;
import java.util.*;

/**
 * Created by phoenix on 2/4/17.
 */
public class AnagrammerTest {
    private static Anagrammer anagrammer;
    @BeforeClass
    public static void setup() {
        // 1. Instantiate anagrammer
        // 2. cache word list?
        anagrammer = new AnagrammerImpl(new WordListFileImpl());
    }
    @Test
    public void test() {
        // get chars, min, max
        // get anagrams
    }
    @Test
    public void testListWords() {
        String chars = "asdf";
        List<String> words = anagrammer.listWords(chars, 3);
        putList(words);
    }
    @Test
    public void testListWordsMinMax() {
        String chars = "asdfjkl";
        List<String> words = anagrammer.listWords(chars,4);
        putList(words);
    }
    private static String listItems(List<String> words) {
        StringJoiner sj = new StringJoiner("\n");
        words.forEach(sj::add);
        return sj.toString();
    }
    private static void putList(List<String> words) {
        System.out.println(listItems(words));
    }
    private static List<String> lexiSort(List<String> words) {
        words.sort((x, y) -> x.length() < y.length()? -1 : x.length() > y.length()? 1 : x.compareTo(y));
        return words;
    }
    @Test
    public void testPermute() {
        String chars = "lpcear";
        putList(anagrammer.listWords(chars, 3));
    }
    @Test
    public void testa() {
        String str;
        while (true) {
            str = JOptionPane.showInputDialog(null, "Enter characters:", "Anagram", JOptionPane.PLAIN_MESSAGE);
            if (str == null || str.length() == 0) {
                break;
            }
//            putList(anagrammer.listWords(str, 3));
            String items = listItems(lexiSort(anagrammer.listWords(str,3)));
            System.out.println("== == == ==START== == == ==");
            System.out.println(items);
            System.out.println("== == == == END == == == ==");
            JOptionPane.showMessageDialog(null, items);
        }
        System.out.println("** ** ** ** Wubba lubba dub dub! ** ** ** **");
    }
}
