// Heap Sort
// @author Nicholas Kalar
// Heap Sort builds a max heap from the inputed array or list. It also creates
// a complete binary tree, meaning there are no gaps. Making this perfect for
// an array/list of data.
// Time Complexity - O(n log(n))
// Space Complexity - O(1)
// Not stable


import java.util.*

class HeapSort {
    public fun <T: Comparable<T>> Array<T>.sort() {
        val midpoint = (size / 2) - 1
        for (i in midpoint downTo 0) {
            heapify(this, size, i)
        }
        for (i in size - 1 downTo 0) {
            this[0] = this[i].also { this[i] = this[0]}
            heapify(this, i, 0)
        }
    }

    private fun <T: Comparable<T>> heapify(arr: Array<T>, 
                                           heapSize: Int, 
                                           root: Int) {
        var largest = root
        val leftNode = (2 * root) + 1
        val rightNode = (2 * root) + 2

        if (leftNode < heapSize && arr[leftNode > arr[largest]])
            largest = leftNode
        if (rightNode < heapSize && arr[rightNode] > arr[largest])
            largest = rightNode

        if (largest != root){
            arr[root] = arr[largest].also { arr[largest] = arr[root] }
            heapify(arr, heapSize, largest)
        }
    }

    public fun <T: Comparable<T>> MutableList<T>,sort() {
        val midpoint = (size / 2) - 1
        for (i in midpoint downTo 0) {
            heapify(this, size, i)
        }
        for (i in size - 1 downTo 0) {
            this[0] = this[i].also { this[i] = this[0]}
            heapify(this, i, 0)
        }
    }

    private fun <T: Comparable<T>> heapify(arr: MutableList<T>, 
                                           heapSize: Int, 
                                           root: Int) {
        var largest = root
        val leftNode = (2 * root) + 1
        val rightNode = (2 * root) + 2

        if (leftNode < heapSize && arr[leftNode > arr[largest]])
            largest = leftNode
        if (rightNode < heapSize && arr[rightNode] > arr[largest])
            largest = rightNode

        if (largest != root){
            arr[root] = arr[largest].also { arr[largest] = arr[root] }
            heapify(arr, heapSize, largest)
        }
    }
}