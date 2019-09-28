import java.lang.IllegalArgumentException

class ShapeFactory {

    fun getShape(shapeType: String): Shape? {
        when (shapeType) {
            "Circle" -> return Circle()
            "Rectangle" -> return Rectangle()
            "Square" -> return Square()
        }
        return null
    }
}