// Insertion Sort
// @author Nicholas Kalar
// Insertion sort iterates over an array or list comparing a key value to all
// values of smaller indices, swapping any that are larger, and stopping when
// a value less than the key is reached, or the start of the array is reached
// Time complexity - O(n^2)
// Space complexity - O(1)
// Stable

import java.util.*

public fun <T: Comparable<T>> Array<T>.sort() {
    val len = size
    for (i in 1 until len) {
        var keyValue = this[i]
        var j = i - 1

        while (j >= 0 && this[j] > keyValue) {
            this[j + 1] = this[j]
            j--
        }
        this[j + 1] = keyValue
    }
}

public fun <T: Comparable<T>> MutableList<T>.sort() {
    val len = size
    for (i in 1 until len) {
        var keyValue = this[i]
        var j = i - 1

        while (j >= 0 && this[j] > keyValue) {
            this[j + 1] = this[j]
            j--
        }
        this[j + 1] = keyValue
    }
}

public fun <T: Comparable<T>> List<T>.sort(): List<T> {
    val len = size
    val sortedList = toMutableList()
    for (i in 1 until len) {
        var keyValue = sortedList[i]
        var j = i - 1

        while (j >= 0 && sortedList[j].compareTo(keyValue) > 0) {
            sortedList[j + 1] = sortedList[j]
            j--
        }
        sortedList[j + 1] = key
    }
    return sortedList
}