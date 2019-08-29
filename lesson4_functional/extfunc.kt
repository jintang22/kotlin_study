

data class Item(val name: String, val price: Float)                                   // 1  

data class Order(val items: Collection<Item>)  

fun Order.maxPricedItemValue(): Float = this.items.maxBy { it.price }?.price ?: 0F    // 2  
fun Order.maxPricedItemName() = this.items.maxBy { it.price }?.name ?: "NO_PRODUCTS"

fun Order.maxPricedItemName2() : String? {
	//return this.items.maxBy { it.price }?.name ?: "NO_TEST_PRODUCTS"
	return this.items.maxBy{it.price}?.name?: "NO_TEST_PRODUCTS"
}

val Order.commaDelimitedItemNames: String                                             // 3
    get() = items.map { it.name }.joinToString()

fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"  // 1


fun main() {

	var itemList = listOf(
		Item("Bread", 25.0F)
		, Item("Wine", 29.0F)
		, Item("Water", 12.0F)
		, Item("Meat", 99F)
	)

	itemList = listOf()

    val order = Order( itemList )
    
    println("Max priced item name: ${order.maxPricedItemName()}")                     // 4
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")                                // 5

	println("test : ${order.maxPricedItemName2()}")

	var highName = itemList.maxBy{ it.price }?.name;

	println("test22 : ${highName.nullSafeToString()}")

}

