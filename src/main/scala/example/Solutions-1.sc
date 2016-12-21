def fibonacci(n: Int): Int = {
  def fibLoop(n: Int, prev: Int, cur: Int): Int =
    if (n <= 0) prev
    else fibLoop(n - 1, cur, prev + cur)

  fibLoop(n, 0, 1)
}
fibonacci(8)

def factorial(number: Int, accumulator: Int = 1): Int =
  if (number <= 1) {
    accumulator
  } else {
    factorial(number - 1, accumulator * number)
  }

factorial(7)


def compose[X, Y, Z](f: X => Y, g: Y => Z): X => Z =
  (x: X) => g(f(x))


def isSorted[A](xs: List[A], gt: (A, A) => Boolean): Boolean = {

  def go(n: Int):Boolean = {
    if (n >= xs.length - 1) true
    else if (gt(xs(n), xs(n + 1))) go(n+1) else false
  }
  go(0)
}
