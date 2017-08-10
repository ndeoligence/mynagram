package org.nodexy.mynagram;

import java.util.List;

/**
 * Created by phoenix on 2/4/17.
 */
public interface Anagrammer {
    List<String> listWords(String chars);
    List<String> listWords(char[] chars);
    List<String> listWords(String chars, int min);
    List<String> listWords(char[] chars, int min);
    List<String> listWords(String chars, int min, int max);
    List<String> listWords(char[] chars, int min, int max);
}
