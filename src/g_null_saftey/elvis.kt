package g_null_saftey

fun main() {
    // 엘비스 연산자(`?:` : null 값이 감지될 경우 어떻게 할지 선언
    val name:String? = null
    val safeName = name ?: "이름없음"
    println(safeName)

    val str:String? = "abcdefg" // nullable
                            // ?. safety call ?: elvis
    println("문자열의 길이 : ${str?.length ?: 0}")
}