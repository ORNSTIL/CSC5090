package cobot.encoder;

public interface EncoderHelper {
    int[] parse(String command);

    String encode(int[] angles);
}
