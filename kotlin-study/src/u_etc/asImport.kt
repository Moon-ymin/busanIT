package u_etc

// as import
// import 가져왔을 때 클래스나 메서드 이름이 같을 경우 별칭 제공

import java.util.Date as utilDate
import java.sql.Date as sqlDate

fun main() {
    val utilDate = utilDate()
    val sqlDate = sqlDate(System.currentTimeMillis())
}