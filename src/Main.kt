 fun main() {
        val name = readDishName()
        val price = readDishPrice()

        val dish = Dish(
            id = 1,
            name = name,
            category = "Основное",
            ingredients = listOf("Ингредиент 1", "Ингредиент 2")
        )

        println("Цена: $price")
        dish.printInfo()
    }

