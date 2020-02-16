package com.knoldus

object ETL {
  def perform(from: String, to: String){
    object TextFile extends FilesWithText(from)
    object Load extends LoadWithUppercase(TextFile)
    Load.load(to)
  }
}
