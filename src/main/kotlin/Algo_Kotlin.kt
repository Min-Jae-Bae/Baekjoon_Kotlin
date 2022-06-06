import java.util.Scanner

fun main() {
    Star2439()
}

// 백준 2438번
fun Star2438() {

    val sc: Scanner = Scanner(System.`in`)

    val A = sc.nextInt()

    for (i in 1..A) {
        println()
        for (j in 1..i) {
            print("*")
        }
    }
}

fun Star2439() {
    val sc: Scanner = Scanner(System.`in`)

    val A = sc.nextInt()


    // 공백을 4칸 만든다, 3칸 만든다, 2칸 만든다

    // 별을 1개, 2개, 3개 ~ 찍는다

    // 줄바꿈을 한다

    for (i in A downTo 1 ) {
        println()
        for (j in 1 .. A)
    }
}


