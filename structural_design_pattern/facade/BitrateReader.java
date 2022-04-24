package structural_design_pattern.facade;

public class BitrateReader {
    public static BitrateBuffer read(String fileName, Codec sourceCodec) {
        return new BitrateBuffer();
    }

    public static String convert(BitrateBuffer buffer, Codec destinationCodec) {
        return "";
    }
}
