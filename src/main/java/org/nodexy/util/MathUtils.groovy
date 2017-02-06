package org.nodexy.util

/**
 * Created by phoenix on 2/4/17.
 */
class MathUtils {
    static Number p(Number n, Number r) {
        assert n>=r
        factorial(n) / factorial(n-r)
    }
     static Number c(Number n, Number r) {
        assert n>=r
        factorial(n) / (factorial(n-r)*factorial(r))
    }
     static Number factorial(Number x) {
        assert x >= 0
        BigInteger f = 1
        if (x > 1) 1.upto x, {f *= it}
        return f
    }
}
