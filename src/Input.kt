fun readDishName(): String {
    println("Введите название блюда:")
    return readLine() ?: ""
}

fun readDishPrice(): Double {
    println("Введите цену блюда:")
    return readLine()?.toDoubleOrNull() ?: 0.0
}