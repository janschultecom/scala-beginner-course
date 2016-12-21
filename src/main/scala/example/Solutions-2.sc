


// ADT - Sum type (aka Tagged Union)
sealed trait TrafficLight
object Red extends TrafficLight
object Yellow extends TrafficLight
object Green extends TrafficLight

val trafficLight:TrafficLight = Green

def show(light: TrafficLight) = light match {
  case Green => "Go!"
  case Yellow => "Wait for it..."
  case Red => "Stop!"
}

show(trafficLight)

sealed trait Maybe
case object Empty extends Maybe
case class Just(value:Any) extends Maybe


def compute(i:Int):Maybe = if(i >= 0) {
  Just(i + 1)
} else {
  Empty
}

println(compute(1))
println(compute(-1))

val just = Just(0)

def length[A](items: List[A]): Int = items match {
  case Nil => 0
  case (x :: xs) => 1 + length(xs)
}
