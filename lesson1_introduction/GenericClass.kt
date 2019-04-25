class MutableStack<E>(vararg items: E) {              // 1

  private val elements = items.toMutableList()

  fun push(element: E) = elements.add(element)        // 2

  fun peek(): E = elements.last()                     // 3

  fun pop(): E = elements.removeAt(elements.size - 1)

  fun isEmpty() = elements.isEmpty()

  fun size() = elements.size

  override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun main() {

	//var mutableStack = MutableStack<Int>(1,2,3)
	var mutableStack = MutableStack(1,2,3)
	


	println(mutableStack.size())

	println(mutableStack.toString())

	println(mutableStack.peek())

	println(mutableStack.pop())

	println(mutableStack.size())

	println(mutableStack.toString())
}