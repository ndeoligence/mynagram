package org.nodexy.mynagram

import java.util.*
import javax.swing.JOptionPane

fun main(args: Array<String>) {
    val anagrammer: Anagrammer = AnagrammerImpl(WordListFileImpl())
    var str: String?
    while (true) {
        str = JOptionPane.showInputDialog(null, "Enter characters:", "Anagram", JOptionPane.PLAIN_MESSAGE)
        if (str == null || str.isEmpty()) {
            break
        }
        //            putList(anagrammer.listWords(str, 3));
        val items = listItems(lexiSort(anagrammer.listWords(str, 3)))
        println("== == == ==START== == == ==")
        println(items)
        println("== == == == END == == == ==")
        JOptionPane.showMessageDialog(null, items)
    }
    println("** ** ** ** Wubba lubba dub dub! ** ** ** **")
}

fun listItems(words: List<String>): String {
    val sj = StringJoiner("\n")
    words.forEach {w-> sj.add(w)}
    return sj.toString()
}

fun lexiSort(words: List<String>): List<String> {
    return words.sortedWith(compareBy( {it.length}, {it}))
}