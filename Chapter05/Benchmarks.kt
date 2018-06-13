package mastering.kotlin.performance.chapter5

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.BenchmarkMode
import org.openjdk.jmh.annotations.Mode
import org.openjdk.jmh.annotations.OutputTimeUnit
import java.util.*
import java.util.concurrent.TimeUnit

class Student(
        val firstName: String,
        val secondName: String,
        val age: Int)

val students = listOf(
        Student("Jacob", "Smith", 20),
        Student("Isabella", "Williams", 24),
        Student("Ava", "Johnson", 19),
        Student("Anthony", "Taylor", 18),
        Student("Elijah", "Davis", 17),
        Student("Daniel", "Moore", 24),
        Student("Ethan", "Thomas", 30),
        Student("Elijah", "Jackson", 25),
        Student("Jacob", "Anderson", 18),
        Student("Joshua", "Miller", 29),
        Student("Liam", "Davis", 22)
)

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.SECONDS)
open class Benchmarks {

    @Benchmark
    fun forEachIterator() {
        students.forEach {
            println(it.firstName)
        }
    }

    @Benchmark
    fun forEachWhile() {
        students.foreach {
            println(it.firstName)
        }
    }

    @Benchmark
    fun forEachLinkedListIterator() {
        LinkedList<Student>(students).forEach {
            println(it.firstName)
        }
    }

    @Benchmark
    fun forEachLinkedListWhile() {
        LinkedList<Student>(students).foreach {
            println(it.firstName)
        }
    }

    @Benchmark
    fun list() = (0..1_000_000)
            .filter { it % 2 == 0 }
            .map { it * it }
            .first()

    @Benchmark
    fun sequence() = (0..1_000_000)
            .asSequence()
            .filter { it % 2 == 0 }
            .map { it * it }
            .first()

}