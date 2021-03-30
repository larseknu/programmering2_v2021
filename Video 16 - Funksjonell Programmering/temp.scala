
val salaries = List(2, 7, 4)
val doubleSalaries = salaries.map(x => x * 2) // (4, 14, 8)
val doubleSalaries = salaries.filter(x => x>10) // (14)
val doubleSalaries = salaries.foldLeft(Nil)((rev, x) => x :: rev ) // (8, 14, 4)



def add(x : Int, y : Int) : Int = x+y
add(1,2)

def add(x : Int)(y : Int) : Int = x+y
add(1)(2)

val addToOne = add(1)
addToOne(2) 















