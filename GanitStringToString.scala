package com.ravi.learning.spark.com.ravi.learning.spark.ganit

object GanitStringToString {

  def main(args: Array[String]): Unit = {
    println(functionStringToString("123456"))
    println(functionStringToString("12345"))
  }

  def functionStringToString(input : String) : String = {
    var in = input;
    var str = "";
    var length = 0
    if(in.length % 2 == 0 )
      length = in.length / 2
    else
      length = in.length / 2 +1
    for(i <- (0 until length)){
      if(in.length == 1) {
        str += in.substring(0)
        in = in.substring(0)
      }
      else {
        str += in.substring(0,1) + in.substring(in.length-1)
        in = in.substring(1,in.length-1)
      }
    }
    str
  }

}
