package factory

open class Object(var id: Int, var name: String, var price: Double){
    override fun toString(): String {
        return "<id: $id, name: $name, price: $price, "
    }
}