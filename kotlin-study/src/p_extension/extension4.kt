package p_extension

// Top-Level 최상단에 선언
fun String.lastChar(): Char {
    return this[this.length - 1]
}