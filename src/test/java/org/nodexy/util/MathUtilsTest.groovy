package org.nodexy.util

import org.junit.Test

/**
 * Created by phoenix on 2/4/17.
 */
class MathUtilsTest {
    @Test
    void test() {
        def objs = ['A', 'B', 'C'] as Object[]
        println "permute($objs):\n${MathUtils.permute(objs)}"
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
