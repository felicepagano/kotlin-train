package j;

import k.Passenger;

import java.util.Objects;
import java.util.Optional;

@Deprecated
public final class Seat {
    private Optional<k.Passenger> optionalPassenger = Optional.empty();

    @Override
    public String toString() {
        return optionalPassenger.map((p) -> p.toString()).orElse("_");
    }

    public Optional<k.Passenger> getOptionalPassenger() {
        return optionalPassenger;
    }

    public void setOptionalPassenger(Optional<Passenger> optionalPassenger) {
        Objects.requireNonNull(optionalPassenger);
        this.optionalPassenger = optionalPassenger;
    }
}
