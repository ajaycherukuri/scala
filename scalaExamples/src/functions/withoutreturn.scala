package functions

object withoutreturn {
  
   def main(args: Array[String]) {
      printMe;
   }
   
   def printMe( ) : Unit = { //if you say unit it's like void.
      println("Hello, Scala!")
   }
}
