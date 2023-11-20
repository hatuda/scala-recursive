@main
def basicFib(num:Int): Unit = {
  println(s"Fibonacci($num):${fib(num)}")
}

def fib(n: Int): BigInt = n match {
  case 0 => 0
  case 1 => 1
  case n => fib(n - 2) + fib(n - 1)
}