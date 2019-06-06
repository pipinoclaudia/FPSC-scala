package handlingException

object OptionTest {
  
  
  def main(args: Array[String]): Unit = {
    val names = List("anna","Ernesto","giacomo","pino","peppe")
    
    val fooMap : List[Option[String]] = names.map(name =>foo(name));
    
    val fooFlatmap : List[String] = names.flatMap(name =>foo(name));
    
    
    
    val forCompNames = for (name <- names if (name.length() == 4)) yield name
    
    forCompNames.foreach(name => println(name))
    
    println(fooMap)
    println(fooFlatmap)
    
  }
  
  
  def foo(name : String) : Option[String] ={
    if(name.length()==4)
     Some(name)
     
     else
       None
  }
}