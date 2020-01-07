// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;
  /* hide underlying implementation for set */

@Name("L_Rbtree_Node") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class L_RBTREE_NODE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_RBTREE_NODE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_RBTREE_NODE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_RBTREE_NODE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_RBTREE_NODE position(long position) {
        return (L_RBTREE_NODE)super.position(position);
    }

    public native @ByRef RB_TYPE key(); public native L_RBTREE_NODE key(RB_TYPE setter);
    public native @ByRef RB_TYPE value(); public native L_RBTREE_NODE value(RB_TYPE setter);
    public native L_RBTREE_NODE left(); public native L_RBTREE_NODE left(L_RBTREE_NODE setter);
    public native L_RBTREE_NODE right(); public native L_RBTREE_NODE right(L_RBTREE_NODE setter);
    public native L_RBTREE_NODE parent(); public native L_RBTREE_NODE parent(L_RBTREE_NODE setter);
    public native @Cast("l_int32") int color(); public native L_RBTREE_NODE color(int setter);
}
