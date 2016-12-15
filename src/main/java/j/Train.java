package j;

import k.Locomotive;
import k.RailroadCar;

import java.util.List;
import java.util.Objects;

@Deprecated
public class Train {

    private List<RailroadCar> railroadCars;
    private boolean running = false;

    public Train(final List<RailroadCar> composition) {
        Objects.requireNonNull(composition);
        railroadCars = composition;
    }

    public int getTotalWeight() {
        return railroadCars.stream().mapToInt(RailroadCar::getWeight).sum();
    }

    public int getTotalTowableMass() {
        return railroadCars.stream()
                .filter((c) -> c instanceof k.Locomotive)
                .map((c) -> (Locomotive) c)
                .mapToInt(Locomotive::getTowableMass)
                .sum();
    }

    public void start() {
        if (getTotalTowableMass() < getTotalWeight()) {
            throw new IllegalStateException("Too many coaches");
        }
        running = true;
    }

    public void stop() {
        running = false;
    }

    public boolean isRunning() {
        return running;
    }

    public List<RailroadCar> getRailroadCars() {
        return railroadCars;
    }
}
