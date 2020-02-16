package com.knoldus

object Driver extends App{
  LoadWithUppercase.load("/home/knoldus/knoldus-assignments/new/sample.txt")
  ETLCall.perform("/home/knoldus/knoldus-assignments/orignal/sample.txt", "/home/knoldus/knoldus-assignments/new/", LoadWithUppercase)
}
