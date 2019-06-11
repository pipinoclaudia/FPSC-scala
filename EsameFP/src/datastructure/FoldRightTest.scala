package datastructure

object FoldRightTest {
  
  
  //viene usata per generalizzare la computazione che applica una funzione a tutti gli elementi di una lista
  def foldRight[A,B](as : List[A], z : B)(f : (A,B)=>B):B=as match {
    case Nil => z
    case Cons(h, t) => f(h, foldRight(t , z)(f))
    
  }
  
  def sum2(list : List[Int]) = 
    foldRight(list, 0)((x,y)=>x+y)  //type inference of x and y from list of Int
  
  def main(args: Array[String]): Unit = {
    
    val list : List[Int] = List.apply(1,2,3,4,5)
    
    
    println(list)
    println(sum2(list))
    
  }
  
}