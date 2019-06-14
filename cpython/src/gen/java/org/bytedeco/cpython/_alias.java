// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _alias extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _alias() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _alias(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _alias(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _alias position(long position) {
        return (_alias)super.position(position);
    }

    public native @Cast("identifier") PyObject name(); public native _alias name(PyObject setter);
    public native @Cast("identifier") PyObject asname(); public native _alias asname(PyObject setter);
}