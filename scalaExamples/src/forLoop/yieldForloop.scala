
package forLoop

object yieldForloop {
   def main(args: Array[String]) {
      var a = 0;
      var b = 0;
      val numList = List(1,2,3,4,5,6,7,8,9,10);

      // for loop execution with a yield
      //for loop with multiple filters.
      var retVal = for{ a <- numList if a > 3; if a < 8 }yield a*2
      //Yield condition can be like a>0, a=5 etc..
      
      //will print List
      println(retVal);
            println(a);

      // Now print returned values using another loop.
      for( b <- retVal){
         println( "Value of a: " + b );
      }
   }
}