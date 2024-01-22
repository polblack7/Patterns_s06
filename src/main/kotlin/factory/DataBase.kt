package factory

import java.lang.StringBuilder
import java.util.TreeMap

class DataBase {
    val objects = TreeMap<Int, Object>()

    fun addObject(obj: Object) {
        objects[obj.id] = obj
    }

    fun getObj(objId: Int): Object? {
        return objects[objId]
    }

    override fun toString(): String {
        val strBuild = StringBuilder(objects.size * "< , , ,".length)
        for (obj: Object in objects.values) {
            strBuild.appendLine(obj.toString())
        }
        return strBuild.toString()
    }
}

