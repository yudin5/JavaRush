package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Tigrenok on 24.08.2017.
 */

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes image) throws IllegalArgumentException {

        if (image == ImageTypes.BMP) return new BmpReader();
        if (image == ImageTypes.JPG) return new JpgReader();
        if (image == ImageTypes.PNG) return new PngReader();

        throw new IllegalArgumentException();
    }
}
