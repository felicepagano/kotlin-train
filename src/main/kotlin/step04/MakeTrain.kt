package step04

import k.*
import k.TicketType.*
import java.util.*

fun main(args: Array<String>) {

    val locomotives: List<Locomotive> = listOf(Locomotive())

    val choaches: MutableList<Coach> = ArrayList()
    choaches.add(makeCoachWithTickets(FREE, REGULAR, REGULAR, REGULAR))
    choaches += makeCoachWithTickets(REDUCED, REGULAR, REGULAR, null)

    val railroadCars /* : List<RailroadCar> */ = locomotives + choaches
    val train = Train(railroadCars)
    println("Don't miss the train   $train")
    train.checkAndStart()
}

fun makeCoachWithTickets(vararg ticketTypes: TicketType?): Coach {
    val coach = Coach(ticketTypes.size)
    coach.seats.forEachIndexed { i, seat ->
        ticketTypes[i]?.let { seat.passenger = Passenger(ticketType = it) }
    }
    return coach
}
