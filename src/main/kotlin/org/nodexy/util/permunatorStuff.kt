package org.nodexy.util

import java.math.BigInteger
import java.util.Collections.swap
import java.util.ArrayList


fun main(args: Array<String>) {
    val input = "POUCH"
    val minSize = 3
    val maxSize = 10

    val sized = stringCombinations(input, minSize,maxSize)
    println(sized)
}

fun stringCombinations(text: String, minSize: Int, maxSize: Int = -1): List<String> {
    val min = if (minSize > 0) minSize else 1
    val max: Int = if (maxSize>min && maxSize<=text.length) maxSize else text.length
    val results = ArrayList<String>()
    for (i in 0 until text.length) {
        // Record size as the list will change
        val resultsLength = results.size
        for (j in 0 until resultsLength) {
            results.add(text[i] + results[j])
        }
        results.add(Character.toString(text[i]))
    }
    return results.sortedWith(compareBy(String::length, String::toString)).filter { s->
        s.length in min..max
    }
}

fun StringPermutations(text: String): List<String> {
    return permutations(text.toList()).map { it->
        it.joinToString("")
    }
}

fun combinations(elements: List<Any>, n: Int): List<List<Any>> {
    if (n>elements.size) throw IllegalArgumentException("n is bigger than size of elements")



    return listOf()
}

/**
 * Source: https://en.wikipedia.org/wiki/Heap%27s_algorithm
 * This is an implementation of Heap's Algorithm. The algorithm generates
 * all the possible permutations of elements with minimum movement.
 * This is the iterative form.
 */
fun <T> permutations(elements: List<T>): List<List<T>> {
    val A = elements.toMutableList()
    val perms = mutableListOf<List<T>>()

    val c = arrayListOf<Int>()

    for (i in 0 until A.size) {
        c += 0
    }

    assert(c.size == A.size) {"${c.size} != ${A.size}"}

    perms.add(A.toList())

    var i = 0
    while (i < A.size) {
        if (c[i] < i) {
            if (isEven(i)) {
                swap(A, 0, i)
            } else {
                swap(A, c[i], i)
            }
            perms.add(A.toList())
            c[i] ++
            i = 0
        } else {
            c[i] = 0
            i++
        }
    }

    return perms
}

fun isEven(x: Int) = (x%2 == 0)

fun strList(list : List<List<Any>>): String {
    return list.map { it.joinToString(", ") }.joinToString("\n")
}

fun c(n: Int, r: Int): Int {
    assert(r<=n)
    return fact(n)/fact(n-1)
}
fun p(n: Int, r: Int): Int {
    assert(n >= r)
    return fact(n)/(fact(n-r) * fact(r))
}

/**
 * Will need to be modified to become more efficient
 */
fun fact(n: BigInteger): BigInteger {
    var ans = BigInteger.ONE
    var c = BigInteger.ONE
    while (c <= n) {
        ans *= c
        c += BigInteger.ONE
    }
    return ans
}
fun fact(n: Int): Int {
    var ans = 1
    var c = 1
    while (c<=n) {
        ans *= c
        c ++
    }
    return ans
}
