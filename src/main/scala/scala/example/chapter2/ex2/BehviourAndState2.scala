package scala.example.chapter2.ex2

import akka.actor.ActorSystem
import akka.actor.Props

object BehviourAndState2 extends App {
  val actorSystem = ActorSystem("helloActor")
  val actor = actorSystem.actorOf(Props(classOf[SummingActorWithConstructor], 0),"summingActor")
  while (true) {
    Thread.sleep(2000)
    actor ! 1
  }
}