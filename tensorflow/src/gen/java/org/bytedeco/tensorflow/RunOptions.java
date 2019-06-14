// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RunOptions extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RunOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RunOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RunOptions position(long position) {
        return (RunOptions)super.position(position);
    }

  public RunOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public RunOptions(@Const @ByRef RunOptions from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef RunOptions from);

  public native @ByRef @Name("operator =") RunOptions put(@Const @ByRef RunOptions from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef RunOptions default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const RunOptions internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(RunOptions other);
  public native void Swap(RunOptions other);
  

  // implements Message ----------------------------------------------

  public native RunOptions New();

  public native RunOptions New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef RunOptions from);
  public native void MergeFrom(@Const @ByRef RunOptions from);
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
  @MemberGetter public static native @Cast("const tensorflow::RunOptions::TraceLevel") int NO_TRACE();
  public static final int NO_TRACE = NO_TRACE();
  @MemberGetter public static native @Cast("const tensorflow::RunOptions::TraceLevel") int SOFTWARE_TRACE();
  public static final int SOFTWARE_TRACE = SOFTWARE_TRACE();
  @MemberGetter public static native @Cast("const tensorflow::RunOptions::TraceLevel") int HARDWARE_TRACE();
  public static final int HARDWARE_TRACE = HARDWARE_TRACE();
  @MemberGetter public static native @Cast("const tensorflow::RunOptions::TraceLevel") int FULL_TRACE();
  public static final int FULL_TRACE = FULL_TRACE();
  public static native @Cast("bool") boolean TraceLevel_IsValid(int value);
  @MemberGetter public static native @Cast("const tensorflow::RunOptions::TraceLevel") int TraceLevel_MIN();
  public static final int TraceLevel_MIN = TraceLevel_MIN();
  @MemberGetter public static native @Cast("const tensorflow::RunOptions::TraceLevel") int TraceLevel_MAX();
  public static final int TraceLevel_MAX = TraceLevel_MAX();
  @MemberGetter public static native int TraceLevel_ARRAYSIZE();
  public static final int TraceLevel_ARRAYSIZE = TraceLevel_ARRAYSIZE();
  public static native @Cast("const google::protobuf::EnumDescriptor*") Pointer TraceLevel_descriptor();
  public static native @StdString BytePointer TraceLevel_Name(@Cast("tensorflow::RunOptions::TraceLevel") int value);
  public static native @Cast("bool") boolean TraceLevel_Parse(@StdString BytePointer name,
        @Cast("tensorflow::RunOptions::TraceLevel*") IntPointer value);
  public static native @Cast("bool") boolean TraceLevel_Parse(@StdString String name,
        @Cast("tensorflow::RunOptions::TraceLevel*") IntBuffer value);
  public static native @Cast("bool") boolean TraceLevel_Parse(@StdString BytePointer name,
        @Cast("tensorflow::RunOptions::TraceLevel*") int... value);
  public static native @Cast("bool") boolean TraceLevel_Parse(@StdString String name,
        @Cast("tensorflow::RunOptions::TraceLevel*") IntPointer value);
  public static native @Cast("bool") boolean TraceLevel_Parse(@StdString BytePointer name,
        @Cast("tensorflow::RunOptions::TraceLevel*") IntBuffer value);
  public static native @Cast("bool") boolean TraceLevel_Parse(@StdString String name,
        @Cast("tensorflow::RunOptions::TraceLevel*") int... value);

  // accessors -------------------------------------------------------

  // .tensorflow.DebugOptions debug_options = 6;
  public native @Cast("bool") boolean has_debug_options();
  public native void clear_debug_options();
  @MemberGetter public static native int kDebugOptionsFieldNumber();
  public static final int kDebugOptionsFieldNumber = kDebugOptionsFieldNumber();
  public native @Const @ByRef DebugOptions debug_options();
  public native DebugOptions release_debug_options();
  public native DebugOptions mutable_debug_options();
  public native void set_allocated_debug_options(DebugOptions debug_options);
  public native void unsafe_arena_set_allocated_debug_options(
        DebugOptions debug_options);
  public native DebugOptions unsafe_arena_release_debug_options();

  // .tensorflow.RunOptions.Experimental experimental = 8;
  public native @Cast("bool") boolean has_experimental();
  public native void clear_experimental();
  @MemberGetter public static native int kExperimentalFieldNumber();
  public static final int kExperimentalFieldNumber = kExperimentalFieldNumber();
  public native @Const @ByRef RunOptions_Experimental experimental();
  public native RunOptions_Experimental release_experimental();
  public native RunOptions_Experimental mutable_experimental();
  public native void set_allocated_experimental(RunOptions_Experimental experimental);
  public native void unsafe_arena_set_allocated_experimental(
        RunOptions_Experimental experimental);
  public native RunOptions_Experimental unsafe_arena_release_experimental();

  // int64 timeout_in_ms = 2;
  public native void clear_timeout_in_ms();
  @MemberGetter public static native int kTimeoutInMsFieldNumber();
  public static final int kTimeoutInMsFieldNumber = kTimeoutInMsFieldNumber();
  public native @Cast("google::protobuf::int64") long timeout_in_ms();
  public native void set_timeout_in_ms(@Cast("google::protobuf::int64") long value);

  // .tensorflow.RunOptions.TraceLevel trace_level = 1;
  public native void clear_trace_level();
  @MemberGetter public static native int kTraceLevelFieldNumber();
  public static final int kTraceLevelFieldNumber = kTraceLevelFieldNumber();
  public native @Cast("tensorflow::RunOptions_TraceLevel") int trace_level();
  public native void set_trace_level(@Cast("tensorflow::RunOptions_TraceLevel") int value);

  // int32 inter_op_thread_pool = 3;
  public native void clear_inter_op_thread_pool();
  @MemberGetter public static native int kInterOpThreadPoolFieldNumber();
  public static final int kInterOpThreadPoolFieldNumber = kInterOpThreadPoolFieldNumber();
  public native @Cast("google::protobuf::int32") int inter_op_thread_pool();
  public native void set_inter_op_thread_pool(@Cast("google::protobuf::int32") int value);

  // bool output_partition_graphs = 5;
  public native void clear_output_partition_graphs();
  @MemberGetter public static native int kOutputPartitionGraphsFieldNumber();
  public static final int kOutputPartitionGraphsFieldNumber = kOutputPartitionGraphsFieldNumber();
  public native @Cast("bool") boolean output_partition_graphs();
  public native void set_output_partition_graphs(@Cast("bool") boolean value);

  // bool report_tensor_allocations_upon_oom = 7;
  public native void clear_report_tensor_allocations_upon_oom();
  @MemberGetter public static native int kReportTensorAllocationsUponOomFieldNumber();
  public static final int kReportTensorAllocationsUponOomFieldNumber = kReportTensorAllocationsUponOomFieldNumber();
  public native @Cast("bool") boolean report_tensor_allocations_upon_oom();
  public native void set_report_tensor_allocations_upon_oom(@Cast("bool") boolean value);
}