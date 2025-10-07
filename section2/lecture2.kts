
// Kotlin에서는 null이 가능한 타입을 완전히 다르게 취급한다
// null이 아닌 경우에만 호출되는 Safe Call(?.) 이 있다
// null인 경우에만 호출되는 Elvis 연산자(?:) 가 있다.
// null이 절대 아닐때 사용할 수 있는 널 아님 단언 (!!) 이 있다.
fun main(){

    val str:String? = "ABC"
    println(str.length) //error : null이 들어올 수 있기때문
    println(str?.length) // error 안남
    // safe call : null이 아니면 뒤에껄 실행 null이면 null 반환

    // Elvis 연산자 , 앞의 연산 결과가 null이면 뒤의 값을 사용
    val str: String? = "ABC"
    str?.length ?: 0

}

// null이 들어올 수 있음을 명시
fun startsWithA1(str: String?) : Boolean{
    if (str == null){
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")

}

fun startsWithA2(str: String?): Boolean? {
    if ( str == null){
        return null
    }
    return str.startsWith("A")
}

// nullable type이지만, 아무리 생각해도 null이 될 수 없는 경우
// null 아님 단언
fun startWithA3(str: Stinrg?) : Boolean {
    return str!!.startsWith("A")
}