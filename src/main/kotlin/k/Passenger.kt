package k

data class Passenger(val ticketId: Any = generateId(),
                     val ticketType: TicketType = TicketType.REGULAR) {

    override fun toString(): String =
            when (ticketType) {
                TicketType.REGULAR -> "☺"
                TicketType.REDUCED -> "♿"
                TicketType.FREE -> "♛"
            }

}
