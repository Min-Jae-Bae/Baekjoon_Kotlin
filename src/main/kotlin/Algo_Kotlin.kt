import java.util.*

fun main() {
    Algo5598()
}

// 백준 2438번, 6월 12일
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

// 백준 2439번, 6월 13일
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


// 백준 2440번, 6월 14일
fun Star2440() {

    val sc: Scanner = Scanner(System.`in`)
    val N = sc.nextInt()

    for (i in 0 until N) {
        for (k in 0 until N - i) {
            print("*")
        }
        println()
    }
}

// 백준 2441번, 6월 15일
fun Star2441() {

    val sc: Scanner = Scanner(System.`in`)
    val N = sc.nextInt()

    for (i in 0 until N) {

        for (z in 0 until i) {
            print(" ")
        }

        for (k in 0 until N - i) {
            print("*")
        }
        println()
    }
}

//백준 2442번, 6월 17일
fun Star2442() {

    val sc: Scanner = Scanner(System.`in`)
    val N = sc.nextInt()

    for (i in 0 until N) {

        for (z in 0 until N - i) {
            print(" ")
        }

        for (k in 0 until (2 * i) + 1) {
            print("*")
        }
        println()
    }
}

//백준 2443번, 6월 23일

fun Star2443() {

    val sc: Scanner = Scanner(System.`in`)
    val N = sc.nextInt()

    for (i in 0 until N) { // 총 5번 반복

        for (z in 0 until i) { //띄어쓰기 0 ~ 5번
            print(" ")
        }

        for (k in 9 downTo (2 * i) + 1) { // 0번째 일 때 9번 반복 -> 홀수로 간다.
            print("*")
        }
        println()
    }
}

//백준 2444번, 6월 24일

fun Star2444() {

    val sc: Scanner = Scanner(System.`in`)
    val N = sc.nextInt()

    for (i in 0 until N) {

        for (z in 1 until N - i) {
            print(" ")
        }

        for (k in 0 until (2 * i) + 1) {
            print("*")
        }
        println()
    }

    for (i in 0 until N - 1) { // 총 4번 반복

        for (z in 0 until i + 1) { //띄어쓰기 0 ~ 4번
            print(" ")
        }

        for (k in 7 downTo (2 * i) + 1) { // 0번째 일 때 9번 반복 -> 홀수로 간다.
            print("*")
        }
        println()
    }
}

//백준 5598번 6월 27일
fun Algo5598() {

    val sc: Scanner = Scanner(System.`in`)
    val str = sc.next()

    for (element in str) {
        print((element.code - 3).toChar().toString())
    }
}