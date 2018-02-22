package warmup

import java.util.*

/**
 * Created by AliSh on 2/22/2018.
 */
fun main(arg: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val output = staircase(n)
    println(output)
}

fun staircase(n: Int): String {
    var output = ""
    for (a in 0..(n - 1)) {
        for (b in 0..(n - 1)) {
            if (b >= (n - a - 1)) {
                output += "#";
            } else {
                output += " ";
            }
        }
        if (a != (n - 1)) {
            output += "\n";
        }
    }
    return output
}
