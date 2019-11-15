
import HandshakeCalculator.Signal.*
import org.junit.Test
import kotlin.test.assertEquals

class HandshakeCalculatorTest {

    @Test
    fun testThatInput1YieldsAWink() {
        assertEquals(
            listOf(WINK),
            HandshakeCalculator.calculateHandshake(1))
    }

    //@Ignore
    @Test
    fun testThatInput2YieldsADoubleBlink() {
        assertEquals(
            listOf(DOUBLE_BLINK),
            HandshakeCalculator.calculateHandshake(2))
    }

    //@Ignore
    @Test
    fun testThatInput4YieldsACloseYourEyes() {
        assertEquals(
            listOf(CLOSE_YOUR_EYES),
            HandshakeCalculator.calculateHandshake(4))
    }

    //@Ignore
    @Test
    fun testThatInput8YieldsAJump() {
        assertEquals(
            listOf(JUMP),
            HandshakeCalculator.calculateHandshake(8))
    }

    //@Ignore
    @Test
    fun testAnInputThatYieldsTwoActions() {
        assertEquals(
            listOf(WINK, DOUBLE_BLINK),
            HandshakeCalculator.calculateHandshake(3))
    }

    //@Ignore
    @Test
    fun testAnInputThatYieldsTwoReversedActions() {
        assertEquals(
            listOf(DOUBLE_BLINK, WINK),
            HandshakeCalculator.calculateHandshake(19))
    }

    //@Ignore
    @Test
    fun testReversingASingleActionYieldsTheSameAction() {
        assertEquals(
            listOf(JUMP),
            HandshakeCalculator.calculateHandshake(24))
    }

    //@Ignore
    @Test
    fun testReversingNoActionsYieldsNoActions() {
        assertEquals(
            emptyList(),
            HandshakeCalculator.calculateHandshake(16))
    }

    //@Ignore
    @Test
    fun testInputThatYieldsAllActions() {
        assertEquals(
            listOf(WINK, DOUBLE_BLINK, CLOSE_YOUR_EYES, JUMP),
            HandshakeCalculator.calculateHandshake(15))
    }

    //@Ignore
    @Test
    fun testInputThatYieldsAllActionsReversed() {
        assertEquals(
            listOf(JUMP, CLOSE_YOUR_EYES, DOUBLE_BLINK, WINK),
            HandshakeCalculator.calculateHandshake(31))
    }

    //@Ignore
    @Test
    fun testThatInput0YieldsNoActions() {
        assertEquals(
            emptyList(),
            HandshakeCalculator.calculateHandshake(0))
    }

    //@Ignore
    @Test
    fun testThatInputWithLower5BitsNotSetYieldsNoActions() {
        assertEquals(
            emptyList(),
            HandshakeCalculator.calculateHandshake(32))
    }

}
