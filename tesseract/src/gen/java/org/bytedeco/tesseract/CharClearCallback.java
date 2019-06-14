// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;

// #endif

@Name("TessCallback1<char>") @Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class CharClearCallback extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CharClearCallback() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CharClearCallback(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CharClearCallback(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CharClearCallback position(long position) {
        return (CharClearCallback)super.position(position);
    }

  @Virtual(true) public native void Run(@Cast("char") byte arg0);
}