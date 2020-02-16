package com.knoldus
import java.io.File


import scala.io.{BufferedSource, Source}


abstract class Files() {
  val filePath: String
  val file: File
  val fileName: String
  val fileContents:String
}
