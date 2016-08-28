package functions

//A closure is a function, whose return value depends on the value 
//of one or more variables declared outside this function.
object closureexample {
   def main(args: Array[String]) {
      println( "multiplier(1) value = " +  multiplier(1) )
      println( "multiplier(2) value = " +  multiplier(2) )
   }
   var factor = 3
   val multiplier = (i:Int) => i * factor
}