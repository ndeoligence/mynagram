package org.nodexy.mynagram;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.StringJoiner;

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
    private static void putList(List<String> words) {
        StringJoiner sj = new StringJoiner("\n");
        words.forEach(sj::add);
        System.out.println(sj.toString());
    }
    @Test
    public void testPermute() {
        String chars = "lpcear";
        putList(anagrammer.listWords(chars, 3));
    }
}
