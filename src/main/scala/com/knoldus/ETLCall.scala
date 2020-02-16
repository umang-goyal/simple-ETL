package com.knoldus

object ETLCall {

  def perform(from: String, to: String, action: Load){
    object TextFile extends FilesWithText(from)
    action.load(to)
  }
}
