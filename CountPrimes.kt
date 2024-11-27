fun main() {
    println(countPrimes(21))
}

fun countPrimes(n: Int): Int {
    if (n <= 2) {
        return 0
    }

    val isNotPrime = BooleanArray(n)
    for (p in 2..Math.sqrt(n.toDouble()).toInt()) {
        if (!isNotPrime[p]) {
            for (j in p * p until n step p) {
                println(p)
                isNotPrime[j] = true
            }
        }
    }

    var numberOfPrimes = 0
    for (i in 2 until n) {
        if (!isNotPrime[i]) {
            numberOfPrimes++
        }
    }

    return numberOfPrimes
}