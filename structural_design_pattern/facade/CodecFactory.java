package structural_design_pattern.facade;

import java.io.File;

public class CodecFactory {

    public static Codec extract(File file) {
        return new Codec();
    }
}
