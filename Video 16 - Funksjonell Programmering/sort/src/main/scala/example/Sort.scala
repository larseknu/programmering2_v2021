package example

import scala.math.Ordering.Int


object Sort extends App {

  val list = List(5,3,6,9,1,4,8,2,7)

  // Rekursiv implementasjon av en algoritme som setter inn heltallet x på 
  // riktig posisjon i en sortert liste xs
  def insert(x : Int, xs : List[Int]) : List[Int] =
    xs match {
      case Nil => x :: Nil
      case y :: xs1 if (x <= y) => x :: xs
      case y :: xs1=> y :: insert(x, xs1) }

  // Rekursiv implementasjon av insertion sort
	def sort(xs : List[Int]) : List[Int] = {
    xs match {
      case Nil => Nil
		  case x :: xs1 => insert(x, sort(xs1)) } }

  // Insertion sort implementert med foldLeft
  def sort2(xs : List[Int]) : List[Int] =  
    xs.foldLeft (List[Int]()) {(sorted, x) => insert(x,sorted)} 

  // Rekursiv implementasjon av en algoritme som setter inn heltallet x på 
  // riktig posisjon i en sortert liste xs. Sorteringsrekkefølgen er gitt av 
  // funksjonen order
  def insert_(order : (Int, Int) => Boolean)(x : Int, xs : List[Int]) : List[Int] =
    xs match {
      case Nil => x :: Nil
      case y :: xs1 if (order(x, y)) => x :: xs
      case y :: xs1 => y :: insert_(order)(x, xs1) }

  // Rekursiv implementasjon av insertion sort
	def sort_(order : (Int, Int) => Boolean)(xs : List[Int]) : List[Int] = {
    xs match {
      case Nil => Nil
		  case x :: xs1 => insert_ (order) (x, sort_(order)(xs1)) } }


  // To varianter av samme funksjon, en som sorterer i stigende rekkefølge, og en 
  // som sorterer i synkende rekkefølge
  val sortAsc = sort_(Int.lteq) _
  val sortDesc = sort_(Int.gteq) _

  println(sort(list))
  println(sort2(list))
  println(sortAsc(list))
  println(sortDesc(list))
  println(list)

}
