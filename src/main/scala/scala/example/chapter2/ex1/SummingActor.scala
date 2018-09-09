package scala.example.chapter2.ex1

import akka.actor.Actor

class SummingActor extends Actor {
  var sum = 0
  def receive: Actor.Receive = {
    case x : Int => sum +x
    print(s"my state as sum is $sum")
    case _ => print("i don't what are you talking about")
  }
}