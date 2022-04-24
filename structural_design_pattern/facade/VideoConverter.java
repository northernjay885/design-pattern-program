package structural_design_pattern.facade;

import java.io.File;

public class VideoConverter {

    File convert(String fileName, String format) {
        File file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if ("mp4".equals(format)) {
            destinationCodec = new MPEG4CompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }
        BitrateBuffer buffer = BitrateReader.read(fileName, sourceCodec);
        String result = BitrateReader.convert(buffer, destinationCodec);
        result = (new AudioMixer()).fix(result);
        return new File(result);
    }
}
