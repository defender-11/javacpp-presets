// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

// #else
// #endif

 @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_histogram extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_histogram() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_histogram(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_histogram(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_histogram position(long position) {
        return (gsl_histogram)super.position(position);
    }

  public native @Cast("size_t") long n(); public native gsl_histogram n(long setter);
  public native DoublePointer range(); public native gsl_histogram range(DoublePointer setter);
  public native DoublePointer bin(); public native gsl_histogram bin(DoublePointer setter);
} 