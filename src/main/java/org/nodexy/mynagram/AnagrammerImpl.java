package org.nodexy.mynagram;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by phoenix on 2/4/17.
 */
public class AnagrammerImpl implements Anagrammer {
    private WordList wordList;

    public AnagrammerImpl(WordList wordList) {
        this.wordList = wordList;
    }
    @Override
    public List<String> listWords(String chars) {
        return new LinkedList<>();
    }

    @Override
    public List<String> listWords(char[] chars) {
        return new LinkedList<>();
    }

    @Override
    public List<String> listWords(String chars, int min, int max) {
        return new LinkedList<>();
    }

    @Override
    public List<String> listWords(char[] chars, int min, int max) {
        return new LinkedList<>();
    }
}
