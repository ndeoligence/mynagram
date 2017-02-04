package org.nodexy.util

/**
 * Created by phoenix on 2/4/17.
 */
class MathUtils {
    def static Number p(Number n, Number r) {
        factorial(n) / factorial(n-r)
    }
    def static Number c(Number n, Number r) {
        factorial(n) / (factorial(n-r)*factorial(r))
    }
    def static Number factorial(Number x) {
        assert x >= 0
        BigInteger f = 1
        if (x > 1) 1.upto x, {f *= it}
        return f
    }
}
