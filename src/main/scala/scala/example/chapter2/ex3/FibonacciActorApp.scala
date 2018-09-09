package scala.example.chapter2.ex3

import akka.util.Timeout
import akka.actor.ActorSystem
import akka.actor.Props
import scala.concurrent.Await

object FibonacciActorApp extends App{
  implicitly val timeout = Timeout(10 seconds)
  val actorSystem = ActorSystem("HelloActor")
  val actor = actorSystem.actorOf(Props[FibonacciActor])
  val future = (actor ? 10).mapTo[Int]
  val fibonacciNum = Await.result(future, 10 seconds)
  print(fibonacciNum)
  
}