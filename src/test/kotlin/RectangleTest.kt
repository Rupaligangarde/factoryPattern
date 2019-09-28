import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RectangleTest{
    @Test
    fun `should print message`() {
        val message = Rectangle().draw()
        assertEquals(message, "Rectangle")
    }
}