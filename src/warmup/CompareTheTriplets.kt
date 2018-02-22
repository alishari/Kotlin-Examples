package warmup

import java.util.*

/**
 * Created by AliSh on 2/22/2018.
 */
fun main(arg: Array<String>) {
    val sc = Scanner(System.`in`)

    val aliceArr = IntArray(3)
    val bobArr = IntArray(3)
    for (a in 0..2) {
        aliceArr[a] = sc.nextInt()
    }
    for (a in 0..2) {
        bobArr[a] = sc.nextInt()
    }
    val result = compareTheTriplets(aliceArr, bobArr)
    println(result[0].toString() + " " + result[1].toString())
}

fun compareTheTriplets(aliceArr: IntArray, bobArr: IntArray): IntArray {
    val result = IntArray(2)

    for (a in 0..2) {
        if (aliceArr[a] > bobArr[a]) {
            result[0] += 1
        } else if (aliceArr[a] < bobArr[a]) {
            result[1] += 1
        }
    }

    return result;
}
