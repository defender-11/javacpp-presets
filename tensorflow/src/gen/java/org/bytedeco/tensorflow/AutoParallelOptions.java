// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AutoParallelOptions extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AutoParallelOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AutoParallelOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AutoParallelOptions position(long position) {
        return (AutoParallelOptions)super.position(position);
    }

  public AutoParallelOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public AutoParallelOptions(@Const @ByRef AutoParallelOptions from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef AutoParallelOptions from);

  public native @ByRef @Name("operator =") AutoParallelOptions put(@Const @ByRef AutoParallelOptions from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef AutoParallelOptions default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const AutoParallelOptions internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(AutoParallelOptions other);
  public native void Swap(AutoParallelOptions other);
  

  // implements Message ----------------------------------------------

  public native AutoParallelOptions New();

  public native AutoParallelOptions New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef AutoParallelOptions from);
  public native void MergeFrom(@Const @ByRef AutoParallelOptions from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // bool enable = 1;
  public native void clear_enable();
  @MemberGetter public static native int kEnableFieldNumber();
  public static final int kEnableFieldNumber = kEnableFieldNumber();
  public native @Cast("bool") boolean enable();
  public native void set_enable(@Cast("bool") boolean value);

  // int32 num_replicas = 2;
  public native void clear_num_replicas();
  @MemberGetter public static native int kNumReplicasFieldNumber();
  public static final int kNumReplicasFieldNumber = kNumReplicasFieldNumber();
  public native @Cast("google::protobuf::int32") int num_replicas();
  public native void set_num_replicas(@Cast("google::protobuf::int32") int value);
}