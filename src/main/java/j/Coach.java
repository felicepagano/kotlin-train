package j;

import k.Seat;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Deprecated
public final class Coach implements k.RailroadCar {

    private final List<Seat> seats;

    public Coach(final int availableSeats) {
        if (availableSeats < 1) {
            throw new IllegalArgumentException("availableSeats " + availableSeats);
        }
        seats = IntStream.range(0, availableSeats)
                .mapToObj((i) -> new Seat())
                .collect(Collectors.toList());
    }

    @Override
    public int getWeight() {
        return 5;
    }

    @Override
    public String toString() {
        return "[" +
                seats.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(""))
                + "]";
    }
}
