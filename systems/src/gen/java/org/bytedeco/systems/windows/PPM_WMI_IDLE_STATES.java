// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PPM_WMI_IDLE_STATES extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPM_WMI_IDLE_STATES() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPM_WMI_IDLE_STATES(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPM_WMI_IDLE_STATES(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPM_WMI_IDLE_STATES position(long position) {
        return (PPM_WMI_IDLE_STATES)super.position(position);
    }

    public native @Cast("DWORD") int Type(); public native PPM_WMI_IDLE_STATES Type(int setter);
    public native @Cast("DWORD") int Count(); public native PPM_WMI_IDLE_STATES Count(int setter);
    public native @Cast("DWORD") int TargetState(); public native PPM_WMI_IDLE_STATES TargetState(int setter);          // current idle state
    public native @Cast("DWORD") int OldState(); public native PPM_WMI_IDLE_STATES OldState(int setter);             // previous idle state
    public native @Cast("DWORD64") long TargetProcessors(); public native PPM_WMI_IDLE_STATES TargetProcessors(long setter);
    public native @ByRef PPM_WMI_IDLE_STATE State(int i); public native PPM_WMI_IDLE_STATES State(int i, PPM_WMI_IDLE_STATE setter);
    @MemberGetter public native PPM_WMI_IDLE_STATE State();
}