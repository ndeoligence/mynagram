package org.nodexy.util

import org.junit.Test

/**
 * Created by phoenix on 2/4/17.
 */
class MathUtilsTest {
    @Test
    void test() {
        Integer x = 63
        x.times {println "$it! = ${MathUtils.factorial(it)}"}
    }
    @Test
    void testP() {
        5.times {n->0.upto(n, {r->println "p($n,$r) = ${MathUtils.p(n,r)}"})}
    }
    @Test
    void testC() {
        5.times {n->0.upto(n, {r->println "c($n,$r) = ${MathUtils.c(n,r)}"})}
    }
}
