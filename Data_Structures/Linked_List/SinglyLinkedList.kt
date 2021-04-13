class SinglyLinkedList<T> {
    private var size = 0
    private var head: Node<T>? = null
    
    private inner class Node<T> constructor(internal var data: T, internal var next: Node<T>?)

    fun getFirst() = head?.data
}