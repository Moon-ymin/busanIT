package i_function

// Named Argument : 이름이 있는 매개변수
fun configureServer(host: String, port: Int = 80, protocol: String = "http") {
    println("서버가 $protocol://$host:$port 에서 실행되고 있습니다.")
}

fun main() {
    configureServer("127.0.0.1", 80, "http")
    configureServer("127.0.0.1", 80)
    configureServer("127.0.0.1", )

    // host 와 protocol 만 변경하고 싶을 때
    // 이름을 설정하여 기본값과 함께 사용
    configureServer("127.0.0.1", protocol = "ftp")
    // 이름을 지정하여 사용하면 선언 순서 관련 없이 호출
    // Builder 패턴의 효과, 함수 정의 변경없이 자유롭게 호출 가능
    configureServer(protocol = "ftp", host = "192.168.0.1", port = 21)

}