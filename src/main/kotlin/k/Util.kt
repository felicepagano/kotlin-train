package k

import java.util.concurrent.atomic.AtomicInteger

private val idGenerator = AtomicInteger()

fun generateId(): Any = idGenerator.incrementAndGet().toString()

fun Train.checkAndStart() {
    require(TrainCheckList.execute(this).isEmpty()) { "Check list failed" }
    start()
}

fun loadStandardCheckList() = listOf(TrainSizeCheck(1..5))
