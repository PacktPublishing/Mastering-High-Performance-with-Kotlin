package mastering.kotlin.performance.chapter9

class Lock {

    private val lock = java.lang.Object()

    fun unlock() {
        synchronized(lock) {
            lock.notify()
        }
    }

    fun lock() {
        synchronized(lock) {
            lock.wait()
        }
    }
}