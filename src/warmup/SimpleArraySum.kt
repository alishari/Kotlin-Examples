package warmup

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
    val sum = simpleArraySum(arr)
    println(sum)
}

fun simpleArraySum(arr: IntArray): Int {
    var sum = 0
    for (a in arr) {
        sum += a
    }
    return sum
}
