import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SquareTest {
    @Test
    fun `should return message`() {
        val message = Square().draw()
        assertEquals(message, "Square")
    }
}