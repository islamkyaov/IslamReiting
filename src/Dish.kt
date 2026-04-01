data class Dish(
    val id: Int,
    val name: String,
    val category: String,
    val ingredients: List<String>
) {
    fun printInfo() {
        println("ID: $id, Название: $name, Категория: $category, Ингредиенты: ${ingredients.joinToString(", ")}")
    }
}