import java.util.Scanner

fun main() {
    Star2440()
}

// 백준 2438번
fun Star2438() {

    val sc: Scanner = Scanner(System.`in`)

    val A = sc.nextInt()

    for (i in 0 until A) {
        println()
        for (j in 0 until i) {
            print("*")
        }
    }
}

// 백준 2439번
fun Star2439() {

    val sc: Scanner = Scanner(System.`in`)

    val A = sc.nextInt()


    // 공백을 4칸 만든다, 3칸 만든다, 2칸 만든다

    // 별을 1개, 2개, 3개 ~ 찍는다

    // 줄바꿈을 한다

    for (i in 0 until A) {
        for (k in A - i downTo 1) {
            print(" ")
        }
        for (z in 0 until i) {
            print("*")
        }
        println()
    }
}


// 백준 2440번
fun Star2440() {

    val sc: Scanner = Scanner(System.`in`)
    val N = sc.nextInt()

    for (i in 0 until N) {
        for (k in 0 until N-i) {
            print("*")
        }
        println()
    }
}


