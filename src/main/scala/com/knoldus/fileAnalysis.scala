package com.knoldus


abstract class fileAnalysis{
  val inputFile: Files
  def uniqueWordCount: Map[String,Int] ={

    val words = inputFile.fileContents.toLowerCase.split("\\W+|\\d+").toList

    words.groupBy(x=>x).map(x=> x._1->x._2.length)
  }
}
