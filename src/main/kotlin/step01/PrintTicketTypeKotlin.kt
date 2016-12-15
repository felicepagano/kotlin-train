package step01

import j.TicketType

fun main(vararg args: String) {
    println("Ticket types:")
    for (ticketType in TicketType.values()) {
        println(" - $ticketType")
    }
}
