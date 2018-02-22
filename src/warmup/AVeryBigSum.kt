package warmup

import java.math.BigInteger
import java.util.*

/**
 * Created by AliSh on 2/22/2018.
 */
fun main(arg: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    val arr = IntArray(n)
    for (a in 0..(n - 1)) {
        arr[a] = sc.nextInt()
    }
    val sum = aVeryBigSum(arr)
    println(sum)
}

fun Int.toBigInteger() = BigInteger.valueOf(toLong())

fun aVeryBigSum(arr: IntArray): BigInteger {
    var sum = BigInteger("0")
    for (a in arr) {
        sum += a.toBigInteger()
    }
    return sum
}
