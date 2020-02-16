package com.knoldus
import java.io.File

import scala.io.{BufferedSource, Source}

class FilesWithText(s: String) extends Files {
  val filePath: String = s
  val file = new File(filePath)
  val fileName: String = file.getName

  val source: BufferedSource = Source.fromFile(filePath)

  val fileContents: String = source.mkString
  source.close
}
