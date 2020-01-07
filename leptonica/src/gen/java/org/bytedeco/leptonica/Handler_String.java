// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;

@Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class Handler_String extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Handler_String(Pointer p) { super(p); }
    protected Handler_String() { allocate(); }
    private native void allocate();
    public native void call( String arg0 );
}
