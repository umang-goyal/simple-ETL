package com.knoldus

import java.io.{File, FileNotFoundException, PrintWriter}

object LoadWithUppercase extends Load {
  override val originalFile: Files = TextFile
  override def load(path:String) {
    try {
      val writer = new PrintWriter(new File(path + originalFile.fileName))
      writer.write(originalFile.fileContents.toUpperCase())
      writer.close()
    } catch {
      case ex:FileNotFoundException=> println("file not found")
    }
  }

}
