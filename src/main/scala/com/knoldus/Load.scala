package com.knoldus

import java.io.{File, FileNotFoundException, PrintWriter}

abstract class Load {
 val originalFile:Files
  def load(path:String)
  {
    try {
      val writer = new PrintWriter(new File(path))
      writer.write(originalFile.fileContents)
      writer.close()
    } catch {
      case ex:FileNotFoundException=> println("file not found")
    }
  }
}
