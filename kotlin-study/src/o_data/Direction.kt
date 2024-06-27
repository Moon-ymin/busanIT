package o_data

enum class Direction(val code: String) {
    NORTH("북"), SOUTH("서"), EAST("동"), WEST("서")
    // , NORTHWEST("북서")
}

fun main() {
    val north = Direction.NORTH
    println(north)
    println(north.code)

    val direction = Direction.SOUTH

    // 분기 로직을 자체적으로 생성해야 함
    if (direction == Direction.SOUTH) {
        println("${direction.code}쪽으로 갑니다.")
    }
    if (direction == Direction.NORTH) {
        // 북쪽 관련 로직 ...
    }

    // Enum 클래스와 when 문을 함께 사용
    handleDirection(Direction.SOUTH)
}

// Enum 클래스를 매개변수로 받아 활용하는 메서드
private fun handleDirection(direction: Direction) {
    when (direction) {
        Direction.NORTH -> println("북쪽")
        Direction.SOUTH -> println("남쪽")
        Direction.EAST -> println("동쪽")
        Direction.WEST -> println("서쪽")
    }
}