package j;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Deprecated
public final class TrainCheckList {

    public static final TrainCheckList INSTANCE = new TrainCheckList();
    private List<TrainCheck> standardCheckList;

    public synchronized List<TrainCheck> getStandardCheckList() {
        if (standardCheckList == null) {
            standardCheckList = Util.loadStandardCheckList();
        }
        return standardCheckList;
    }

    public List<String> execute(final Train train) {
        return getStandardCheckList().stream()
                .map((check) -> check.searchIssue(train))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
    }

    private TrainCheckList() {
    }
}
