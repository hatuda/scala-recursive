import scala.annotation.tailrec

@main
def main(): Unit =
  println("StackOverFlow test:Fibonacci")
  println(getFibonacciNaive(1000000))


def getFibonacciNaive(index: BigInt): BigInt =
  if (index <= 0)
    0
  else if (index == 1)
    1
  else
    getFibonacciNaive(index - 1) + getFibonacciNaive(index - 2)
