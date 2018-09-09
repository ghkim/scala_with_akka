package scala.example.chapter2.ex3

import akka.actor.Actor

class FibonacciActor extends Actor {
  def receive: Actor.Receive = {
    case num: Int => val fibonacciNumber = fib(num)
  }

  def fib(n: Int): Int = n match {
    case 0 | 1 => n
    case _     => fib(n - 1) + fib(n + 1)
  }
}