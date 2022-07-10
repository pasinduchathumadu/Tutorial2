//  Q1----------->Q3
object Main {
  def main(args: Array[String]): Unit = {  //This is main function
    val k:Int=2
    var i:Int=2
    val j:Int=2
    val m:Int=5
    val n:Int=5
    val f: Float = 12.0F    //Data type---Float
    val g: Float = 4.0F
    val c: Char = 'X'

    println(k+12*m)
    println(m/j)
    println(n%j)
    println(m/(j*j))
    println(f+(10*5)+g)
    i+=1        //SCALA doesn't support ++i or i++ then we have to use that way
    println(i*n)


  }
}