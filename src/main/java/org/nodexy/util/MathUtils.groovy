package org.nodexy.util

/**
 * Created by phoenix on 2/4/17.
 */
class MathUtils {
    static boolean even (Number x) {
        return x%2 == 0
    }

    /**
     * Permutes all n elements within the array.
     * Assumes that the elements are distinct.
     * @param elements the list of elements
     * @return a list containing all the possible permutations of the given elements.
     */
    static List<Object[]> permute(Object[] elements) {
        if (elements == null || elements.length < 2) return [elements]

        def list = []
        if (elements.size() == 2) {
            list += [elements[0], elements[1]]
            list += [elements[1], elements[0]]
            return list
        } else {
            0.upto elements.size()-1, { i->
                permute(elements.clone()[0..<(elements.size()-1)]).each {permuted->
                    list.add(appendEnd(elements.last(),permuted))
                }
                if (even(i)) {

                } else {

                }
            }
        }
    }
    static Object[] appendEnd(obj, Object[] objects) {
        Object[] res = new Object[objects.size()+1]
        0.upto objects.size()-1, {res[it] = objects[it]}
        res[res.size()-1] = obj
        return res
    }
    /*static List<Object[]> permute(BigInteger r, Object ... elements) {

    }
    static List<Object[]> combinate(BigInteger r, Object ... elements) {
        if (r == BigInteger.ZERO) { return [[] as Object[]] }
        if (elements.size == 1) {
            return [elements] as ArrayList
        } else {
            return null
        }
    }
    static List<Object[]> distribute(Object obj, Object[] objects) {
        def lst = []
        objects.size().times {i->

        }
    }*/
}
