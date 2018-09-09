package scala.example.chapter2.ex2

import akka.actor.Actor

class SummingActorWithConstructor(initNum: Int) extends Actor {
  var sum = 0
  def receive: Actor.Receive = {
    case x: Int =>
      sum = initNum + sum + x
      println(s"my state as sum is $sum")
    case _ => println("i don't what are you talking about")
  }
}