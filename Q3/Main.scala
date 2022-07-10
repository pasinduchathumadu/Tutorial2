object Main {
  def main(args: Array[String]): Unit = {
    var a:Int=2
    var b:Int=3
    var c:Int=4
    var d:Int=5
    val k:Float=4.3f   //val keyword is used to initialize the constant value
    val g:Float=4.0f  //This variable is constant

    b-=1              //++b or b-- operator doesn't support
    println(b*a+c*d)  //24
    d-=1
    println(a) //2
    a+=1
    println(-2*(g-k)+c) //4.6000004
    println(c) //4
    c+=1
    println(c*a) //15
    a+=1

  }
}