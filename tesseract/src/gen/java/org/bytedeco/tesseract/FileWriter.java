// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;

// Function to write a GenericVector<char> to a whole file.
// Returns false on failure.
@Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class FileWriter extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    FileWriter(Pointer p) { super(p); }
    protected FileWriter() { allocate(); }
    private native void allocate();
    public native @Cast("bool") boolean call(@Const @ByRef CharGenericVector arg0, @Const @ByRef STRING arg1);
}