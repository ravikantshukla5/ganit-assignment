package com.ravi.learning.spark.com.ravi.learning.spark.ganit

import com.google.gson.JsonObject

object GanitStringToJson {

  def main(args: Array[String]): Unit = {

    val input = Array("Ganit, Shiva,Welcome to the team"
                       ,"Google, Sundar, Welcome to the search")
    println(getJson(input))
  }

  def getJson(input: Array[String]) : scala.collection.mutable.ListBuffer[JsonObject] = {
    var jsonList = new scala.collection.mutable.ListBuffer[JsonObject]()
    input.map(
    x => x.split(",")
    ).map{ x =>
    val jsonObj = new JsonObject()
    jsonObj.addProperty("Company",x(0))
    jsonObj.addProperty("CEO",x(1))
    jsonObj.addProperty("Greetings",x(2))
    jsonList.append(jsonObj)

  }
    jsonList
  }

}
