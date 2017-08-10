package org.nodexy.mynagram;

import org.nodexy.util.PermunatorStuffKt;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by phoenix on 2/4/17.
 */
public class AnagrammerImpl implements Anagrammer {
    private WordList wordList;
    private int minLen;

    public AnagrammerImpl(WordList wordList) {
        this.wordList = wordList;
    }
    @Override
    public List<String> listWords(String chars) {
        return PermunatorStuffKt.stringCombinations(chars, minLen, chars.length());
    }

    @Override
    public List<String> listWords(char[] chars) {
        return listWords(chars, -1);
    }

    @Override
    public List<String> listWords(String chars, int min) {
        return listWords(chars,min,-1);
    }

    @Override
    public List<String> listWords(char[] chars, int min) {
        return listWords(chars,min,-1);
    }

    @Override
    public List<String> listWords(String chars, int min, int max) {
        List<String> combinations = PermunatorStuffKt.stringCombinations(chars,min,max);
        List<String> more = new LinkedList<>();
        combinations.forEach(it-> more.addAll(PermunatorStuffKt.StringPermutations(it)));
        return more.stream().filter(it->wordList.contains(it)).distinct().collect(Collectors.toList());
    }

    @Override
    public List<String> listWords(char[] chars, int min, int max) {
        return new LinkedList<>();
    }
}
