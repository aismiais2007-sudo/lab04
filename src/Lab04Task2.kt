fun main() {
    val items = mutableListOf("milk", "bread")

    print("Enter a new item: ")
    val newItem = readln()
    items.add(newItem)

    items[0] = "oat milk"

    println("List: $items")
    println("Size: ${items.size}")
}