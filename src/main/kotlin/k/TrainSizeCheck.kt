package k

class TrainSizeCheck(private val validTrainSize: IntRange) : TrainCheck {

    override fun searchIssue(train: Train): String? {
        val trainSize = train.railroadCars.size
        return when {
            trainSize in validTrainSize -> null
            trainSize < validTrainSize.first -> "Train too small"
            else -> "Train too big"
        }
    }

}
