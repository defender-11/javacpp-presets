// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;


/** Data structure for generating gnuplot files */
@Name("GPlot") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class GPLOT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GPLOT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GPLOT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GPLOT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GPLOT position(long position) {
        return (GPLOT)super.position(position);
    }

    /** for cmd, data, output            */
    public native @Cast("char*") BytePointer rootname(); public native GPLOT rootname(BytePointer setter);
    /** command file name                */
    public native @Cast("char*") BytePointer cmdname(); public native GPLOT cmdname(BytePointer setter);
    /** command file contents            */
    public native SARRAY cmddata(); public native GPLOT cmddata(SARRAY setter);
    /** data file names                  */
    public native SARRAY datanames(); public native GPLOT datanames(SARRAY setter);
    /** plot data (1 string/file)        */
    public native SARRAY plotdata(); public native GPLOT plotdata(SARRAY setter);
    /** label for each individual plot   */
    public native SARRAY plotlabels(); public native GPLOT plotlabels(SARRAY setter);
    /** plot style for individual plots  */
    public native NUMA plotstyles(); public native GPLOT plotstyles(NUMA setter);
    /** current number of plots          */
    public native @Cast("l_int32") int nplots(); public native GPLOT nplots(int setter);
    /** output file name                 */
    public native @Cast("char*") BytePointer outname(); public native GPLOT outname(BytePointer setter);
    /** GPLOT_OUTPUT values              */
    public native @Cast("l_int32") int outformat(); public native GPLOT outformat(int setter);
    /** GPLOT_SCALING values             */
    public native @Cast("l_int32") int scaling(); public native GPLOT scaling(int setter);
    /** optional                         */
    public native @Cast("char*") BytePointer title(); public native GPLOT title(BytePointer setter);
    /** optional x axis label            */
    public native @Cast("char*") BytePointer xlabel(); public native GPLOT xlabel(BytePointer setter);
    /** optional y axis label            */
    public native @Cast("char*") BytePointer ylabel(); public native GPLOT ylabel(BytePointer setter);
}
