package e_control

fun main() {
    // when : Java의 switch-case 문에 대응
    // switch-case 문보다 유연하게 복잡한 표현식도 사용 가능
    val number = 2

    // switch -> when
    when (number) {
        // case 를 입력하는 대신 when 에서 받은 값을 바로 분기
        1 -> println("1번 메뉴입니다.")
        2 -> println("2번 메뉴입니다.")
        3 -> println("3번 메뉴입니다.")
        else -> println("잘못 입력하셨습니다.")
    }

    // 범위를 조건으로 사용 가능
    val score = 93
    when (score) {
        in 70 .. 79 -> 'C'
        in 80 .. 89 -> 'B'
        in 90 .. 100 -> 'A'
        else -> 'D'
    }
    // when 조건문의 결과(분기)도 표현식으로 변수나 리턴값에 대입 가능
    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }
    println("$score 는 $grade 학점입니다.")

    fun getUserRole(userType: Int): String {
        return when (userType) {            // return 값으로 사용 가능
            1 -> "관리자"                    // 단독
            2, 3 -> "열심회원"               // 여러개
            in 4 .. 7 -> "일반회원"    // 범위
            else -> "기타회원"
        }
    }
    val userType = 5
    println("${userType}번은 ${getUserRole(5)}입니다.")
}