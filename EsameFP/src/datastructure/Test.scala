package datastructure

object Test {
	def main(args: Array[String]): Unit = {


			val list:List[Int] = List(2,6,3,1,5,9)



					println("test apply list" , list )
					println("test drop list" , List.drop(list, 1))//toglie n elementi dalla lista

					val dW = List.dropWhile(list)(x => x <4)
					
					println("test dropWhile", dW) //restituisce la lista con elementi che soddisfano il predicato passato in input

	}
}