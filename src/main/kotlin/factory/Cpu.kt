package factory

class Cpu(id: Int, name: String, price: Double, var socket: String, var cores: Int, var rate: Int ) : Object(id, name, price) {
    override fun toString(): String {
        return super.toString() + "type: cpu, socket: $socket, cores: $cores, rate: $rate>"
    }
}