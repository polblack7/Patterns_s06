package factory

class Mb(id: Int, name: String, price: Double, var socketType: String, var numberOfCpu: Int, var ramType: String) : Object(id, name, price) {
    override fun toString(): String {
        return super.toString() + "type: motherboard, socket type: $socketType, number of cpu: $numberOfCpu, ram type: $ramType>"
    }
}