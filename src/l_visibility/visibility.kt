package l_visibility

open public class PublicClass {
    public fun publicFun() {
        println("어디서나 접근 가능한 퍼블릭 함수")
    }
    protected fun protectedFun() {
        println("상속 관계에서 사용 가능한 프로텍티드 함수")
    }
    internal fun internalFun() {
        println("같은 모듈 내에서만 접근 가능한 인터널 함수")
    }
    private fun privateFun() {
        println("같은 클래스 내에서만 사용 가능한 프라이빗 함수")
        // 파일 최상단일 경우 같은 파일 내 접근 가능
        val privateClass = PrivateClass()
    }
}

private class PrivateClass() {
    public fun publicFun() {
        val publicClass = PublicClass()
        publicClass.publicFun()
        publicClass.internalFun()
        //publicClass.protectedFun()  // 상속관계 아니면 호출 불가
        //publicClass.privateFun()    // 다른 클래스에서 호출 불가
    }
}

class ExtendsClass : PublicClass() {
    fun test() {
        protectedFun()          // 상속 관계 클래스에서만 호출 가능
        //privateFun()            // 상속 관계에서도 접근 불가
    }
}