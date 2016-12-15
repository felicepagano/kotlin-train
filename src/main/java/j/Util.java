package j;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public final class Util {

    private static final AtomicInteger idGenerator = new AtomicInteger();

    private Util() {
    }

    public static Object generateId() {
        return String.valueOf(idGenerator.incrementAndGet());
    }

    public static void checkAndStart(Train train) {
        if (!TrainCheckList.INSTANCE.execute(train).isEmpty()) {
            throw new IllegalArgumentException("Check list failed");
        }
        train.start();
    }

    public static List<TrainCheck> loadStandardCheckList() {
        return Arrays.asList(new TrainSizeCheck(1, 5));
    }
}
