import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CircleTest{
    @Test
    fun `should return message`() {
        val message = Circle().draw()
        assertEquals(message, "Circle")
    }
}