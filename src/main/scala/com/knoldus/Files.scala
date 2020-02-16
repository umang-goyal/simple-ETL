package com.knoldus
import java.io.File


abstract class Files() {
  val filePath: String
  val file: File
  val fileName: String
  val fileContents:String
}
