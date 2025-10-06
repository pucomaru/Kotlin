
// 코틀린에서는 타입을 컴파일러가 추론해줘서 의무적으로 명시안해줘도 됨
// 초기값 초기화안해주면 println 에러
// 초기값 지정해주지않는경우에는 타입을 명시해줘야함
// val 컬렉션에는 element를 추가할 수 있다.

// 간단 Tip => 모든 변수는 우선 val로 만들고 꼭 필요한 경우 var로 변경

// 자바에서 long -> primitive type 값 자체를 저장
// Long 은 Wrapper class 참조형

// 코틀린은 숫자,불리언,문자에 대해서는 자동으로 상황에 따라서 참조형을 원시형으로 바꿈
// 즉 , 프로그래머가 boxing / unboxing을 고려하지 않아도 되도록 알아서 처리
// 코틀린은 기본적으로 null이 들어갈 수 없게끔 설계
fun main() {

    // 가변 변수
    var number1 : Long = 10L
    number1 = 5L
    println(number1)

    // 불변 변수
    // Java에서는 final
    val number2 = l0L
    number2 = 5L  // error

    // null 가능 명시 type? 을 써줘야 함
    var number3 : Long? = 10L
    number3 = null

    // 자바에서는 객체 인스턴스 선언할 때 new를 써줘야하지만 코틀린은 안씀
    var person = Person("dayea")
}