package scala.example.chapter1

import akka.actor.ActorSystem

object HelloAkkaActorSystem extends App{
    val actorSystem = ActorSystem("helloActor")
    print(actorSystem)
}