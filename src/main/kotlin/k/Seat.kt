package k

class Seat(var passenger: Passenger? = null) {
    override fun toString() = passenger?.toString() ?: "_"
}
