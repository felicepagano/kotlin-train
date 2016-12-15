package j;

import java.util.Optional;

@Deprecated
public class TrainSizeCheck implements TrainCheck {

    private int minSize, maxSize;

    public TrainSizeCheck(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    @Override
    public Optional<String> searchIssue(Train train) {
        final int trainSize = train.getRailroadCars().size();
        if (trainSize < minSize)
            return Optional.of("Train too small");
        else if (trainSize > maxSize)
            return Optional.of("Train too big");
        else
            return Optional.empty();
    }
}
