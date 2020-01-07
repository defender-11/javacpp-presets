// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;



    /**
     * <pre>
     * The JbData struct holds all the data required for
     * the compressed jbig-type representation of a set of images.
     * The data can be written to file, read back, and used
     * to regenerate an approximate version of the original,
     * which differs in two ways from the original:
     *   (1) It uses a template image for each c.c. instead of the
     *       original instance, for each occurrence on each page.
     *   (2) It discards components with either a height or width larger
     *       than the maximuma, given here by the lattice dimensions
     *       used for storing the templates.
     * </pre>
     */
@Name("JbData") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class JBDATA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public JBDATA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JBDATA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JBDATA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public JBDATA position(long position) {
        return (JBDATA)super.position(position);
    }

    /** template composite for all classes    */
    public native PIX pix(); public native JBDATA pix(PIX setter);
    /** number of pages                       */
    public native @Cast("l_int32") int npages(); public native JBDATA npages(int setter);
    /** max width of original page images     */
    public native @Cast("l_int32") int w(); public native JBDATA w(int setter);
    /** max height of original page images    */
    public native @Cast("l_int32") int h(); public native JBDATA h(int setter);
    /** number of classes                     */
    public native @Cast("l_int32") int nclass(); public native JBDATA nclass(int setter);
    /** lattice width for template composite  */
    public native @Cast("l_int32") int latticew(); public native JBDATA latticew(int setter);
    /** lattice height for template composite */
    public native @Cast("l_int32") int latticeh(); public native JBDATA latticeh(int setter);
    /** array of class ids for each component */
    public native NUMA naclass(); public native JBDATA naclass(NUMA setter);
    /** array of page nums for each component */
    public native NUMA napage(); public native JBDATA napage(NUMA setter);
    /** array of UL corners at which the      */
    /** template is to be placed for each     */
    /** component                             */
    public native PTA ptaul(); public native JBDATA ptaul(PTA setter);
}
