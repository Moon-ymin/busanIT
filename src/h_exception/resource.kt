package h_exception

import java.io.BufferedReader
import java.io.FileReader

// 코틀린은 try-with-resource 구문이 없음
// 대신 .use 라는 확장함수를 사용
fun readFileClose() {
    BufferedReader(FileReader("README.md")).use {
        reader -> println(reader.readLine())
    }
    // use 블록이 끝나면서 자원이 정리가 됨
}