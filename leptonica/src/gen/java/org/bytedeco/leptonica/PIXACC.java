// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;



/*-------------------------------------------------------------------------*
 *                       Pix accumulator container                         *
 *-------------------------------------------------------------------------*/

/** Pix accumulator container */
@Name("Pixacc") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class PIXACC extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PIXACC() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PIXACC(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PIXACC(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PIXACC position(long position) {
        return (PIXACC)super.position(position);
    }

    /** array width                       */
    public native @Cast("l_int32") int w(); public native PIXACC w(int setter);
    /** array height                      */
    public native @Cast("l_int32") int h(); public native PIXACC h(int setter);
    /** used to allow negative            */
    /** intermediate results              */
    public native @Cast("l_int32") int offset(); public native PIXACC offset(int setter);
    /** the 32 bit accumulator pix        */
    public native PIX pix(); public native PIXACC pix(PIX setter);
}
