package hof


object Sort {



	def isSorted[A] (array: Array[A], f : (A,A)=>Boolean): Boolean = {
			@annotation.tailrec
			def go(n:Int) : Boolean = 
			if(n >= array.length-1){ 

				true // ho scorso tutta la lista e sono ordinati
			}
			else if(!f(array(n), array(n+1))) false

			else go(n+1)

			go(0)


	}


	def findFirst[A](array: Array[A], f : A => Boolean) : Int = {
			@annotation.tailrec
			def loop(n:Int): Int = {
					if(n >= array.length)
						-1
						else if(f(array(n))) 
							n
							else 
								loop(n+1)
			}

			loop(0)

	}

	//per avere C devo applicare a e b utilizzando la funzione f(a,b). gli argomenti vengono applicati solo 
	//perche' non verranno applicati ad A=>B. Simile per uncurry e compose

	def curry[A,B,C] (f:(A,B) => C) : A=>(B=>C) = {

			(a)=> (b) => f(a,b)

	}


	def uncurry[A,B,C](f:A=>B=>C):(A,B)=>C ={
			(a,b)=> f(a)(b)
	}
	def compose[A,B,C](f:B=>C, g:A=>B):A=>C ={
			a=>f(g(a))
	}

	def GDC(n1 : Int , n2 : Int) : Int ={

			if(n2 ==0) 
				n1
			else
				GDC(n2, n1%n2)

	} 


	def GDC2(n1 : Int , n2 : Int) : Int = n2 match{

	case 0 => n1
	case _ => GDC2(n2, n1%n2)

	} 

	def main(args: Array[String]): Unit = {

			val array = Array(9,2,3,4)

					println("findFirst:")
					println(findFirst(array, (x:Int)=> x == 3))

					println("GDC:")
					println(GDC(15, 25))

					println("GDC with pattern matching:")
					println(GDC2(15, 25))

					println(isSorted(array, (x:Int, y:Int) =>x<= y))

					println(curry((x:Int, y:Int) =>x+y))

	}

}
