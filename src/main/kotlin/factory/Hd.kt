package factory


class Hd(id: Int, name: String, price: Double, var capacity: Int, var speed: Int ) : Object(id, name, price) {
    override fun toString(): String {
        return super.toString() + "type: hard disk, capacity: $capacity, speed: $speed>"
    }
}