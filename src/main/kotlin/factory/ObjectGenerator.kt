package factory

class ObjectGenerator{
    fun getCpu(id: Int, name: String, price: Double, socket: String, cores: Int, rate: Int ) : Cpu {
        return Cpu(id, name, price, socket, cores, rate)
    }

    fun getHD(id: Int, name: String, price: Double, capacity: Int, speed: Int ) : Hd {
        return Hd(id, name, price, capacity, speed)
    }

    fun getMB(id: Int, name: String, price: Double, socketType: String, numberOfCpu: Int, ramType: String) : Mb {
        return Mb(id, name, price, socketType, numberOfCpu, ramType)
    }
}