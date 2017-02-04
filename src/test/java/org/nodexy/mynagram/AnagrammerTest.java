package org.nodexy.mynagram;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

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
        List<String> words = anagrammer.listWords(chars);
        putList(words);
    }
    @Test
    public void testListWordsMinMax() {
        String chars = "asdfjkl";
        List<String> words = anagrammer.listWords(chars,4,5);
        putList(words);
    }
    private static void putList(List<String> words) {
        System.out.print("[ ");
        words.forEach(s->System.out.print(s+" "));
        System.out.print("]");
    }
}
