package o_data

sealed interface Clickable {
    fun click()
}

sealed interface Focusable {
    fun focus()
}

class Button : Clickable, Focusable {
    override fun click() {
        println("버튼이 클릭 되었습니다.")
    }

    override fun focus() {
        println("버튼이 포커스 되었습니다.")
    }
}

class TextField : Focusable {
    override fun focus() {
        println("텍스트 창이 포커싱되었습니다")
    }
}

fun main() {
    val button = Button()
    button.focus()
    button.click()

    val textField = TextField()
    textField.focus()

    handleFocus(textField)
    handleFocus(button)
}

fun handleFocus(focusable: Focusable) {
    when (focusable) {
        is Button -> println("버튼 포커싱")
        is TextField -> println("텍스트 필드 포커싱")
    }
}