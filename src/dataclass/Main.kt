package dataclass

fun main() {
    when(readln().toInt()){
        1 -> Person1Showcase()
        2 -> Person2Showcase()
        3 -> Person3Showcase()
        4 -> PokemonShowcase()
    }
}


private fun Person1Showcase() {
    val p1 = Person1("John", 18)
    val p2 = Person1("Mike", 20)
    val p3 = Person1("John", 18)

    println("p1 = $p1")
    println("p2 = $p2")
    println("p3 = $p3")
    println("p1 == p2 => ${p1 == p2}")
    println("p2 == p3 => ${p2 == p3}")
    println("p1 == p3 => ${p1 == p3}")
}

private fun Person2Showcase() {
    val p1 = Person2("John", 18)
    val p2 = Person2("Mike", 20)
    val p3 = Person2("John", 18)

    println("p1 = $p1")
    println("p2 = $p2")
    println("p3 = $p3")
    println("p1 == p2 => ${p1 == p2}")
    println("p2 == p3 => ${p2 == p3}")
    println("p1 == p3 => ${p1 == p3}")
}

private fun Person3Showcase() {
    val p1 = Person3("John", 18)
    val p2 = Person3("Mike", 20)
    val p3 = Person3("John", 18)

    println("p1 = $p1")
    println("p2 = $p2")
    println("p3 = $p3")
    println("p1 == p2 => ${p1 == p2}")
    println("p2 == p3 => ${p2 == p3}")
    println("p1 == p3 => ${p1 == p3}")
}

private fun PokemonShowcase() {
    val piece1 = PokemonCard("Charizard",7, 2)
    val piece2 = PokemonCard("Charizard",7, 2)

    println(piece1)
    println(piece2)
    println("piece1 == piece2 = ${piece1 == piece2}")
}
