

package fibonacci

object Fibonacci {
  
  
  
	def fib(n:Int) : Int = {

			@annotation.tailrec
			def loop(n: Int, curr : Int, prev : Int ): Int =
      	if(n==0) {
      		prev
      
      	}

      	else {
      		loop(n-1, curr, prev+curr)
      
      	}
			loop(n,0,1)

	}

	//ok
	def fib2(n:Int):Int= n match {
  	case 0 | 1 => n
  	case _ => fib2( n-1 ) + fib2( n-2 )
	}

	  def fibonacci(x: Int): Int = {
    @annotation.tailrec
    def fibHelper(x: Int, prev: Int = 0, next: Int = 1): Int = x match {
      case 0 => prev
      case 1 => next
      case _ => fibHelper(x - 1, next, next + prev)
    }
    fibHelper(x, 0, 1)
  }
	
	def printFibonacci(n : Int, p:Int => Int) : Int = {
	  @annotation.tailrec
	  def loop(n : Int, value:Int ) : Int = {
	    if(n ==0)
	      value
	      
	    else if(n==1) n
	    
	    else loop(n-1, value+n)
	  }
	  
	  loop(n, 1)
	  
	  
	}
	
	//bugs
	def fib3(n: Int) : Int = {
	  @annotation.tailrec
	  def loop(n:Int, curr: Int, prev: Int) : Int = n match{
	    case 0 => prev
	    case _ =>  loop(n-1, curr, prev+curr)
	  }
	  
	  loop(n, 0, 1)
	}

	def main(args: Array[String]): Unit = {

	  var i =0;
	    while (i<10) {
	       i += 1
	      println("printed fibonacci : "+ printFibonacci(i, fibonacci))
	     
	      
	    }
			println(fib(1)+fib(2)+","+fib(3)+","+fib(4)+","+fib(5)+","+fib(6)+","+fib(7)+","+fib(8))
			println(fib2(1)+","+fib2(2)+","+fib2(3)+","+fib2(4)+","+fib2(5)+","+fib2(6)+","+fib2(7)+","+fib2(8))
			println(fib3(1)+","+fib3(2)+","+fib3(3)+","+fib3(4)+","+fib3(5)+","+fib3(6)+","+fib3(7)+","+fib3(8))
		


	}
}