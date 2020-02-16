package com.knoldus

import java.io.{File, FileNotFoundException, PrintWriter}

class LoadWithUppercase(val originalFile: Files) {

  def load(path:String) {
    try {
      val writer = new PrintWriter(new File(path + originalFile.fileName))
      writer.write(originalFile.fileContents.toUpperCase())
      writer.close()
    } catch {
      case ex:FileNotFoundException=> println("file not found")
    }
  }

}
