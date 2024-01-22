package factory

fun dataBaseFilling(db: DataBase) {
    val objGenerator = ObjectGenerator()
    for (i in 1..10) {
        val cpu = objGenerator.getCpu(i, "Процессор $i", 250.0 + i * 15, "LGA1200", 6 + i/5, 3 + i / 3)
        val mb = objGenerator.getMB(i + 10, "Материнская плата $i", 150.0 + i * 10, "Socket-AM4", 1 + i/5, "DDR4")
        val hd = objGenerator.getHD(i + 20, "Жесткий диск $i", 80.0 + i * 5, 1000 + i * 100, 7200 + i*1000/3)

        db.addObject(cpu)
        db.addObject(mb)
        db.addObject(hd)
    }
}

fun cmdLine(input: String?): Int? {

    return try {
        input?.toInt()
    } catch (exp: Exception) {
        return null
    }
}

fun main() {
    val db = DataBase()
    dataBaseFilling(db)
    println(db.toString())

    print("Enter id of product or enter to do nothing: ")
    val inputId = cmdLine(readlnOrNull())
    if (inputId == null) {
        println("Not found")
    }
    else {
        println(db.getObj(inputId)?.toString())
    }
    println("Goodbye")
}