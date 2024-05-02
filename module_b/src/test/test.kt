package test

import internal.ModuleAClass        // module_a에서 참조 (의존성)
import l_visibility.PublicClass     // kotlin_study 에서 참조 (의존성)


fun main() {
    // 다른 모듈에서도 접근 가능
    val publicClass = PublicClass()
    publicClass.publicFun()     // 함수 가시성도 public 접근 가능
    // publicClass.internalFun()   // internal 외부 접근 불가

    // Internal 클래스는 다른 모듈에서 접근 불가
    // InternalClass()
    ModuleAClass()


}