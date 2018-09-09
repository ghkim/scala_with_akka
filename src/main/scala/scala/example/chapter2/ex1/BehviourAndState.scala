package scala.example.chapter2.ex1

import akka.actor.ActorSystem
import akka.actor.Props

object BehviourAndState extends App {
  val actorSystem = ActorSystem("helloActor")
  val actor = actorSystem.actorOf(Props[SummingActor],"summingActor")
  print(actor.path)
}