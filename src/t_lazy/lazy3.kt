package t_lazy

import java.io.File

// lazy 사용하여 파일을 처음 접근할때만 로딩하기
fun main() {
    val fileContent: String by lazy {
        println("파일을 불러오고 있습니다...")
        File("README.md").readText()  // 파일 텍스트 반환
    }

    println("파일에 접근하기 전")
    println(fileContent)        // 파일 내용이 로드 됨.
    println("==========================")
    println(fileContent)        // 두번째 이후 접근시는 파일 로드(lazy 블록 수행)하지 않음.

}