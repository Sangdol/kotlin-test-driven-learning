import org.junit.jupiter.api.Assertions.assertEquals

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class SyntaxTest {

    @Test
    fun variableTest() {
        var mutable = 1
        val immutable = 2

        assertEquals(1, mutable)
        assertEquals(2, immutable)
    }

    @Test
    fun stringTest() {
        val multiline = """
            hi"""

        assertEquals("\n            hi", multiline)

        val name = "Sang"
        assertEquals("Hi Sang", "Hi $name")
        assertEquals("Length of Sang: 4", "Length of $name: ${name.length}")
    }

}
