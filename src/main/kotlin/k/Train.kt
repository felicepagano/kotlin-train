package k

class Train(val railroadCars: List<RailroadCar>) {

    var running = false
        private set

    val totalWeight: Int
        get() = railroadCars.sumBy { it.weight }

    val totalTowableMass: Int
        get() {
            var total = 0
            for (car in railroadCars)
                if (car is Locomotive)
                    total += car.towableMass
            return total
        }
    //railroadCars
    // .filterIsInstance(Locomotive::class.java)
    // .sumBy { it.towableMass }

    fun start() {
        check(totalTowableMass >= totalWeight) { "Too many coaches" }
        running  = true
    }

    fun stop() { running  = false }

    override fun toString(): String = railroadCars.joinToString(".")
}
