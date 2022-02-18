//A function that inputs and prints out a name
fun main(){
    myname("Anena")
    rem(20,6)
    add(10,15,11,20)
    interestingfact("I am a dancer")
}
fun myname(name:String){
    println("hello " + name)
}
//A function that given two numbers returns the remainder of their modulus
fun rem(a:Int,b:Int){
    var remainder= a%b
    println(remainder)

}
//A function that returns the sum of any 4 given numbers
fun add(w:Int,x:Int,y:Int,z:Int){
var sum =(w+x+y+z)
    println(sum)
}
//A function that prints an interesting fact about me
fun interestingfact(x:String){
    println(x)
}