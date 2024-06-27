package g_null_saftey

// 사용자로부터 입력받은 내용이 null임을 고려하여 처리
data class UserProfile(val name: String?, val email: String?)

fun printUserProfile(profile: UserProfile) {
    val userName = profile.name ?: "이름없음"
    val userEmail = profile.email ?: "이메일 정보 기재되지 않음"

    println("이름 : ${userName}")
    println("이메일 : ${userEmail}")

    // java의 isNull 과 isEmpty를 합친 메서드
    userName.isNullOrEmpty()
}
fun main() {
    val userProfile = UserProfile("홍길동", null)
    printUserProfile(userProfile)
}