package k

object TrainCheckList {

    val standardCheckList by lazy { loadStandardCheckList() }

    fun execute(train: Train) =
            standardCheckList
                    .map { it.searchIssue(train) }
                    .filterNotNull()

}
