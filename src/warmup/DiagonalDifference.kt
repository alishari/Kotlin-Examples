package warmup

import java.util.*

/**
 * Created by AliSh on 2/22/2018.
 */
fun main(arg: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    val arr = Array(n, { IntArray(n) })
    for (a in 0..(n - 1)) {
        val rowArr = IntArray(n)
        for (b in 0..(n - 1)) {
            rowArr[b] = sc.nextInt()
        }
        arr[a] = rowArr;
    }
    val result = diagonalDifference(arr)
    println(result)
}

fun diagonalDifference(arr: Array<IntArray>): Int {
    var primaryDiagonal = 0;
    var secondaryDiagonal = 0;
    for (a in 0..(arr.size - 1)) {
        val row = arr[a]
        for (b in 0..(row.size - 1)) {
            if (a == b) {
                primaryDiagonal += row[b];
            }
            if ((a + b) == (arr.size - 1)) {
                secondaryDiagonal += row[b]
            }
        }
    }
    return if (primaryDiagonal > secondaryDiagonal) (primaryDiagonal - secondaryDiagonal) else (secondaryDiagonal - primaryDiagonal)
}
