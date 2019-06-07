package datastructure


trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail : List[A]) extends List[A]

object List {


	def apply[A](as :  A*):List[A] ={
			if(as.isEmpty) Nil
			else Cons(as.head: A, apply(as.tail : _*))

	}


	def drop[A](list : List[A], n : Int): List[A] ={

			if(n<=0) list
			else list match{
			  case Nil => Nil
			  case Cons(h,t) => drop(t, n-1)
			}

	}





}


