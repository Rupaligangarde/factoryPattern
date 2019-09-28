import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ShapeFactoryTest {
    @Test
    fun `should return circle shape type`() {
        val shape = ShapeFactory().getShape("Circle")
        assertTrue(shape is Circle)
    }

    @Test
    fun `should return Rectangle shape type`() {
        val shape = ShapeFactory().getShape("Rectangle")
        assertTrue(shape is Rectangle)
    }

    @Test
    fun `should return Square shape type`() {
        val shape = ShapeFactory().getShape("Square")
        assertTrue(shape is Square)
    }

    @Test
    fun `should return null if shape type is invalid`() {
        val shape = ShapeFactory().getShape("blah")
        assertEquals(shape, null)
    }
}