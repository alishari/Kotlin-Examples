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

    val result = plusMinus(arr)
    println(result[0])
    println(result[1])
    println(result[2])
}

fun plusMinus(arr: IntArray): FloatArray {
    var result = FloatArray(3)
    var positives = 0
    var negatives = 0
    var zeros = 0

    for (item in arr) {
        if (item > 0) {
            positives++
        } else if (item < 0) {
            negatives++
        } else {
            zeros++
        }
    }
    result[0] = (positives * 1.0 / arr.size).toFloat()
    result[1] = (negatives * 1.0 / arr.size).toFloat()
    result[2] = (zeros * 1.0 / arr.size).toFloat()
    return result
}
