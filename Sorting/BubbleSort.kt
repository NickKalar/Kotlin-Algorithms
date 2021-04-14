// Bubble Sort
// @author Nicholas Kalar
// Bubble sort iterates over an array or list and compares adjacent values
// If a value is smaller than the value to it's right, they are swapped
// Time complexity - O(n^2)
// Space complexity - O(1)
// Stable

import java.util.*

public fun <T: Comparable<T>> Array<T>.sort() {
    val len = size
    for (i in 0 until (len -1)) {
        for (j in 0 until (len - 1 - i)) {
            if (this[j].compareTo(this[j+1]) > 0) {
                val temp = this[j]
                this[j] = this[j+1]
                this[j + 1] = temp
            }
        }
    }
}

public fun <T: Comparable<T>> MutableList<T>.sort() {
    val len = size
    for (i in 0 until (len -1)) {
        for (j in 0 until (len - 1 - i)) {
            if (this[j].compareTo(this[j+1]) > 0) {
                val temp = this[j]
                this[j] = this[j + 1]
                this[j + 1] = temp
            }
        }
    }
}

public fun <T: Comparable<T>> List<T>.sort(): List<T> {
    val len = size
    val sortedList = toMutableList()
    for (i in 0 until (len - 1)) {
        for (j in 0 until (len - 1 - i)) {
            if (sortedList[j].compareTo(sortedList[j + 1]) > 0) {
                val temp = sortedList[j]
                sortedList[j] = sortedList[j + 1]
                sortedList[j + 1] = temp
            }
        }
    }
    return sortedList
}