package k

class Locomotive : k.RailroadCar {

    override val weight: Int
        get() = 8

    val towableMass: Int
        get() = 20

    override fun toString() = """<˳˳_˳˳\"""
}
