package k

class Coach(availableSeats: Int) : k.RailroadCar {

    init {
        require(availableSeats > 0) { "availableSeats $availableSeats" }
    }

    val seats: List<Seat> = (1..availableSeats).map { Seat() }

    override val weight: Int
        get() = 5

    override fun toString(): String =
            seats.joinToString(separator = "", prefix = "[", postfix = "]")
}
