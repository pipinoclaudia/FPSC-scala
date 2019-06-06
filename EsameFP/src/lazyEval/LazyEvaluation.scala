package lazyEval

object LazyEvaluation {
  
  
  def maybeTwice(b:Boolean, i: =>Int):Int = {
    if(b) i+i
    else 0
    
  }
  
  def maybeTwice2(b:Boolean, i: =>Int): Int ={
    
    lazy val j = i 
    if(b) j+j
    else 0
    
  }
  
  def main(args: Array[String]): Unit = {
    
    println("maybeTwice: ")
    println(maybeTwice(true, {println("Hi!"); 42+1}))
    println("maybeTwice2: ")
    println(maybeTwice2(true, {println("Hi!"); 42+1}))
  }
}