import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {
    private List<Signal> handshake = new ArrayList<>();

    List<Signal> calculateHandshake(int number) {
        List<String> reversedBinary = getReversedBinaryArray(number);

        for (int i = 0; i < reversedBinary.size(); i++) {
            if (reversedBinary.get(i).equals("1")) {
                addSignal(Signal.find(i));
            }
        }

        if (number > 15) Collections.reverse(handshake);

        return handshake;
    }

    private List<String> getReversedBinaryArray(int number) {
        List<String> chars = Arrays.asList(Integer.toBinaryString(number).split(""));
        Collections.reverse(chars);
        return chars;
    }

    private void addSignal(Signal signal) {
        if (signal != null) handshake.add(signal);
    }
}

enum Signal {
    WINK(0), DOUBLE_BLINK(1), CLOSE_YOUR_EYES(2), JUMP(3);

    private int value;

    Signal(int value) {
        this.value = value;
    }

    static Signal find(int value) {
        Signal[] signals = values();

        for (Signal signal : signals) {
            if (signal.value == value) {
                return signal;
            }
        }

        return null;
    }
}