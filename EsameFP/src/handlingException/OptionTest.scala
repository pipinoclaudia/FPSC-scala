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

			println("Test with lift: ")
			val five : Option[Int] = Option(-5)
			
			val abs =  lift(math.abs).apply(five)
			println(abs)
	}

	def abs(x : Int): Int = {
			if(x <0) -x
			else x
	}
	def foo(name : String) : Option[String] ={
			if(name.length()==4)
				Some(name)

				else
					None
	}

	def lift[A,B](f: A=>B): Option[A] => Option[B] = _ map(f)

}