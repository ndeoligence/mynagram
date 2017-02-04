package org.nodexy.util

import org.junit.Test

/**
 * Created by phoenix on 2/4/17.
 */
class MathUtilsTest {
    @Test
    def void test() {
        Integer x = 63
        x.times {println "$it! = ${MathUtils.factorial(it)}"}
    }
    @Test
    def void testP() {
        println MathUtils.p(4,2)
    }
    @Test
    def void testC() {
        println MathUtils.c(4,2)
    }
}
