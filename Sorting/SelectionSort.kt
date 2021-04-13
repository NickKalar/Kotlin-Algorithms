// Selection Sort
// @author Nicholas Kalar
// Selection Sort iterates over an array or list comparing a value to higher
// indices looking for a smaller value. If it finds one, a swap is performed.
// This algorithm always iterates over the list n^2 times, even if the list
// is sorted.
// Time complexity - O(n^2)
// Space complexity - O(1)
// Not Stable

class SelectionSort {
    public fun <T: Comparable<T>> Array<T>.sort() {
        val len = size
        // Look for the minimum value
        for (i in 0 until (len -1 )) {
            var minIndex = i
            for (j in (i + 1) until len) {
                if (this[j].compareTo(this[minIndex]) < 0)
                    minIndex = j
            }
            // Found it. Swap it with the i-th value
            val temp = this[minIndex]
            this[minIndex] = this[i]
            this[i] = temp
        }
    }

    public fun <T: Comparable<T>> MutableList<T>.sort() {
        val len = size
        // Look for the minimum value
        for (i in 0 until (len -1 )) {
            var minIndex = i
            for (j in (i + 1) until len) {
                if (this[j].compareTo(this[minIndex]) < 0)
                    minIndex = j
            }
            // Found it. Swap it with the i-th value
            val temp = this[minIndex]
            this[minIndex] = this[i]
            this[i] = temp
        }
    }

    public fun <T: Comparable<T>> List<T>.sort(): List<T> {
        val len = size
        // Look for the minimum value
        for (i in 0 until (len -1 )) {
            var minIndex = i
            for (j in (i + 1) until len) {
                if (this[j].compareTo(this[minIndex]) < 0)
                    minIndex = j
            }
            // Found it. Swap it with the i-th value
            val temp = this[minIndex]
            this[minIndex] = this[i]
            this[i] = temp
        } 
    }
}