// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;

public class opencv_dnn extends org.bytedeco.javacpp.presets.opencv_dnn {
    static { Loader.load(); }

@Name("std::vector<cv::dnn::Blob>") public static class BlobVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BlobVector(Pointer p) { super(p); }
    public BlobVector(Blob ... array) { this(array.length); put(array); }
    public BlobVector()       { allocate();  }
    public BlobVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef BlobVector put(@ByRef BlobVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef Blob get(@Cast("size_t") long i);
    public native BlobVector put(@Cast("size_t") long i, Blob value);

    public BlobVector put(Blob ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<cv::dnn::Blob*>") public static class BlobPointerVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BlobPointerVector(Pointer p) { super(p); }
    public BlobPointerVector(Blob ... array) { this(array.length); put(array); }
    public BlobPointerVector()       { allocate();  }
    public BlobPointerVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef BlobPointerVector put(@ByRef BlobPointerVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native Blob get(@Cast("size_t") long i);
    public native BlobPointerVector put(@Cast("size_t") long i, Blob value);

    public BlobPointerVector put(Blob ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

// Parsed from <opencv2/dnn.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_DNN_HPP__
// #define __OPENCV_DNN_HPP__

// This is an umbrealla header to include into you project.
// We are free to change headers layout in dnn subfolder, so please include
// this header for future compartibility


/** \defgroup dnn Deep Neural Network module
  \{
    This module contains:
        - API for new layers creation, layers are building bricks of neural networks;
        - set of built-in most-useful Layers;
        - API to constuct and modify comprehensive neural networks from layers;
        - functionality for loading serialized networks models from differnet frameworks.
    <p>
    Functionality of this module is designed only for forward pass computations (i. e. network testing).
    A network training is in principle not supported.
  \}
*/
// #include <opencv2/dnn/dnn.hpp>

// #endif /* __OPENCV_DNN_HPP__ */


// Parsed from <opencv2/dnn/dict.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_DNN_DNN_DICT_HPP__
// #define __OPENCV_DNN_DNN_DICT_HPP__

// #include <opencv2/core.hpp>
// #include <map>
// #include <ostream>
/** \addtogroup dnn
 *  \{
<p>
/** \brief This struct stores the scalar value (or array) of one of the following type: double, cv::String or int64.
 *  \todo Maybe int64 is useless because double type exactly stores at least 2^52 integers.
 */
@Namespace("cv::dnn") @NoOffset public static class DictValue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DictValue(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DictValue(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DictValue position(long position) {
        return (DictValue)super.position(position);
    }

    public DictValue(@Const @ByRef DictValue r) { super((Pointer)null); allocate(r); }
    private native void allocate(@Const @ByRef DictValue r);
    /** Constructs integer scalar */
    public DictValue(int p/*=0*/) { super((Pointer)null); allocate(p); }
    private native void allocate(int p/*=0*/);
    public DictValue() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** Constructs floating point scalar */
    public DictValue(double p) { super((Pointer)null); allocate(p); }
    private native void allocate(double p);
    /** Constructs string scalar */
    public DictValue(@Str BytePointer p) { super((Pointer)null); allocate(p); }
    private native void allocate(@Str BytePointer p);
    public DictValue(@Str String p) { super((Pointer)null); allocate(p); }
    private native void allocate(@Str String p);

    public native int size();

    public native @Cast("bool") boolean isInt();
    public native @Cast("bool") boolean isString();
    public native @Cast("bool") boolean isReal();

    public native @ByRef @Name("operator =") DictValue put(@Const @ByRef DictValue r);

    
}

/** \brief This class implements name-value dictionary, values are instances of DictValue. */
@Namespace("cv::dnn") public static class Dict extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Dict() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Dict(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dict(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Dict position(long position) {
        return (Dict)super.position(position);
    }


    /** Checks a presence of the \p key in the dictionary. */
    public native @Cast("bool") boolean has(@Str BytePointer key);
    public native @Cast("bool") boolean has(@Str String key);

    /** If the \p key in the dictionary then returns pointer to its value, else returns NULL. */
    public native DictValue ptr(@Str BytePointer key);
    public native DictValue ptr(@Str String key);

    /** If the \p key in the dictionary then returns its value, else an error will be generated. */
    public native @Const @ByRef DictValue get(@Str BytePointer key);
    public native @Const @ByRef DictValue get(@Str String key);

    /** \overload */

    /** If the \p key in the dictionary then returns its value, else returns \p defaultValue. */

    /** Sets new \p value for the \p key, or adds new key-value pair into the dictionary. */

    
}

/** \} */



// #endif


// Parsed from <opencv2/dnn/blob.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_DNN_DNN_BLOB_HPP__
// #define __OPENCV_DNN_DNN_BLOB_HPP__
// #include <opencv2/core.hpp>
// #include <vector>
// #include <ostream>
/** \addtogroup dnn
 *  \{
    <p>
    /** \brief Lightweight class for storing and processing a shape of blob (or anything else). */
    @Namespace("cv::dnn") @NoOffset public static class BlobShape extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public BlobShape(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public BlobShape(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public BlobShape position(long position) {
            return (BlobShape)super.position(position);
        }
    
        /** Creates n-dim shape and fill its by \p fill */
        public BlobShape(int ndims/*=4*/, int fill/*=1*/) { super((Pointer)null); allocate(ndims, fill); }
        private native void allocate(int ndims/*=4*/, int fill/*=1*/);
        public BlobShape() { super((Pointer)null); allocate(); }
        private native void allocate();
        /** Creates 4-dim shape [\p num, \p cn, \p rows, \p cols] */
        public BlobShape(int num, int cn, int rows, int cols) { super((Pointer)null); allocate(num, cn, rows, cols); }
        private native void allocate(int num, int cn, int rows, int cols);
        /** Creates n-dim shape from the \p sizes array */
        public BlobShape(int ndims, @Const IntPointer sizes) { super((Pointer)null); allocate(ndims, sizes); }
        private native void allocate(int ndims, @Const IntPointer sizes);
        public BlobShape(int ndims, @Const IntBuffer sizes) { super((Pointer)null); allocate(ndims, sizes); }
        private native void allocate(int ndims, @Const IntBuffer sizes);
        public BlobShape(int ndims, @Const int[] sizes) { super((Pointer)null); allocate(ndims, sizes); }
        private native void allocate(int ndims, @Const int[] sizes);
        /** Creates n-dim shape from the \p sizes vector */
        public BlobShape(@StdVector IntPointer sizes) { super((Pointer)null); allocate(sizes); }
        private native void allocate(@StdVector IntPointer sizes);
        public BlobShape(@StdVector IntBuffer sizes) { super((Pointer)null); allocate(sizes); }
        private native void allocate(@StdVector IntBuffer sizes);
        public BlobShape(@StdVector int[] sizes) { super((Pointer)null); allocate(sizes); }
        private native void allocate(@StdVector int[] sizes);

        /** \brief Returns number of dimensions. */
        public native int dims();

        /** \brief Returns reference to the size of the specified \p axis.
         *
         * Negative \p axis is supported, in this case a counting starts from the last axis,
         * i. e. -1 corresponds to last axis.
         * If non-existing axis was passed then an error will be generated.
         */
        public native @ByRef IntPointer size(int axis);

        /** \brief Returns the size of the specified \p axis.
         *  @see size()
         */
        /** Does the same thing as size(int) const. */
        public native @ByRef @Name("operator []") IntPointer get(int axis);

        /** \brief Returns the size of the specified \p axis.
         *
         * Does the same thing as size(int) const, but if non-existing axis will be passed then 1 will be returned,
         * therefore this function always finishes successfully.
         */
        public native int xsize(int axis);

        /** \brief Returns the product of all sizes of axes. */
        public native @Cast("ptrdiff_t") long total();

        /** \brief Returns pointer to the first element of continuous size array. */
        public native @Const IntPointer ptr();

        /** \brief Checks equality of two shapes. */
        public native @Cast("bool") boolean equal(@Const @ByRef BlobShape other);

        public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef BlobShape r);
    }


    /** \brief This class provides methods for continuous n-dimensional CPU and GPU array processing.
     *
     * The class is realized as a wrapper over \ref cv::Mat and \ref cv::UMat.
     * It will support methods for switching and logical synchronization between CPU and GPU.
    */
    @Namespace("cv::dnn") @NoOffset public static class Blob extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Blob(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Blob(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Blob position(long position) {
            return (Blob)super.position(position);
        }
    
        public Blob() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** \brief Constructs blob with specified \p shape and \p type. */
        public Blob(@Const @ByRef BlobShape shape, int type/*=CV_32F*/) { super((Pointer)null); allocate(shape, type); }
        private native void allocate(@Const @ByRef BlobShape shape, int type/*=CV_32F*/);
        public Blob(@Const @ByRef BlobShape shape) { super((Pointer)null); allocate(shape); }
        private native void allocate(@Const @ByRef BlobShape shape);

        /** \brief Constucts 4-dimensional blob (so-called batch) from image or array of images.
         * @param image 2-dimensional multi-channel or 3-dimensional single-channel image (or array of images)
         * @param dstCn specify size of second axis of ouptut blob
        */
        public Blob(@ByVal Mat image, int dstCn/*=-1*/) { super((Pointer)null); allocate(image, dstCn); }
        private native void allocate(@ByVal Mat image, int dstCn/*=-1*/);
        public Blob(@ByVal Mat image) { super((Pointer)null); allocate(image); }
        private native void allocate(@ByVal Mat image);

        /** \brief Creates blob with specified \p shape and \p type. */
        public native void create(@Const @ByRef BlobShape shape, int type/*=CV_32F*/);
        public native void create(@Const @ByRef BlobShape shape);

        /** \brief Creates blob from cv::Mat or cv::UMat without copying the data */
        
        /** \brief Creates blob from user data.
         *  \details If \p deepCopy is false then CPU data will not be allocated.
         */
        public native @Name("fill") void _fill(@Const @ByRef BlobShape shape, int type, Pointer data, @Cast("bool") boolean deepCopy/*=true*/);
        public native @Name("fill") void _fill(@Const @ByRef BlobShape shape, int type, Pointer data);

        /** Returns reference to cv::Mat, containing blob data. */
        public native @ByRef Mat matRef();
        /** Returns reference to cv::Mat, containing blob data, for read-only purposes. */
        public native @Const @ByRef Mat matRefConst();
        /** Returns reference to cv::UMat, containing blob data (not implemented yet). */
        public native @ByRef UMat umatRef();
        /** Returns reference to cv::UMat, containing blob data, for read-only purposes (not implemented yet). */
        public native @Const @ByRef UMat umatRefConst();

        /** \brief Returns number of blob dimensions. */
        public native int dims();

        /** \brief Returns the size of the specified \p axis.
         *
         * Negative \p axis is supported, in this case a counting starts from the last axis,
         * i. e. -1 corresponds to last axis.
         * If non-existing axis was passed then an error will be generated.
         */
        public native int size(int axis);

        /** \brief Returns the size of the specified \p axis.
         *
         * Does the same thing as size(int) const, but if non-existing axis will be passed then 1 will be returned,
         * therefore this function always finishes successfully.
         */
        public native int xsize(int axis);

        /** \brief Computes the product of sizes of axes among the specified axes range [\p startAxis; \p endAxis).
         * @param startAxis the first axis to include in the range.
         * @param endAxis   the first axis to exclude from the range.
         * \details Negative axis indexing can be used.
         */
        public native @Cast("size_t") long total(int startAxis/*=0*/, int endAxis/*=INT_MAX*/);
        public native @Cast("size_t") long total();

        /** \brief Converts \p axis index to canonical format (where 0 <= axis < dims()). */
        public native int canonicalAxis(int axis);

        /** \brief Returns shape of the blob. */
        public native @ByVal BlobShape shape();

        /** \brief Checks equality of two blobs shapes. */
        public native @Cast("bool") boolean equalShape(@Const @ByRef Blob other);

        /** \brief Returns slice of first two dimensions.
         *  \details The behaviour is similar to the following numpy code: blob[n, cn, ...]
         */
        public native @ByVal Mat getPlane(int n, int cn);

        /* Shape getters of 4-dimensional blobs. */
        /** Returns size of the fourth axis blob. */
        public native int cols();
        /** Returns size of the thrid  axis blob. */
        public native int rows();
        /** Returns size of the second axis blob. */
        public native int channels();
        /** Returns size of the first  axis blob. */
        public native int num();
        /** Returns cv::Size(cols(), rows()) */
        public native @ByVal Size size2();
        /** Returns shape of first four blob axes. */
        public native @ByVal Scalar4i shape4();

        /** \brief Returns linear index of the element with specified coordinates in the blob.
         *
         * If \p n < dims() then unspecified coordinates will be filled by zeros.
         * If \p n > dims() then extra coordinates will be ignored.
         */
        /** \overload */
        public native @Cast("size_t") long offset(int n/*=0*/, int cn/*=0*/, int row/*=0*/, int col/*=0*/);
        public native @Cast("size_t") long offset();

        /* CPU pointer getters */
        /** \brief Returns pointer to the blob element with the specified position, stored in CPU memory.
         *
         * \p n correspond to the first axis, \p cn - to the second, etc.
         * If dims() > 4 then unspecified coordinates will be filled by zeros.
         * If dims() < 4 then extra coordinates will be ignored.
         */
        public native @Cast("uchar*") BytePointer ptr(int n/*=0*/, int cn/*=0*/, int row/*=0*/, int col/*=0*/);
        public native @Cast("uchar*") BytePointer ptr();
        /** \overload */
        /** \overload ptr<float>() */
        public native FloatPointer ptrf(int n/*=0*/, int cn/*=0*/, int row/*=0*/, int col/*=0*/);
        public native FloatPointer ptrf();
        //TODO: add const ptr methods

        /** \brief Shares data from other \p blob.
         * @return *this
         */
        public native @ByRef Blob shareFrom(@Const @ByRef Blob blob);

        /** \brief Changes shape of the blob without copying the data.
         * @return *this
         */
        public native @ByRef Blob reshape(@Const @ByRef BlobShape shape);

        /** \brief Returns type of the blob. */
        public native int type();
    }

/** \} */



// #include "blob.inl.hpp"

// #endif


// Parsed from <opencv2/dnn/dnn.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_DNN_DNN_HPP__
// #define __OPENCV_DNN_DNN_HPP__

// #include <vector>
// #include <opencv2/core.hpp>
// #include <opencv2/dnn/dict.hpp>
// #include <opencv2/dnn/blob.hpp>
/** \addtogroup dnn
 *  \{
    <p>
    /** \brief Initialize dnn module and built-in layers.
     *
     * This function automatically called on most of OpenCV builds,
     * but you need to call it manually on some specific configurations (iOS for example).
     */
    @Namespace("cv::dnn") public static native void initModule();

    /** \brief This class provides all data needed to initialize layer.
     *
     * It includes dictionary with scalar params (which can be readed by using Dict interface),
     * blob params #blobs and optional meta information: #name and #type of layer instance.
    */
    @Namespace("cv::dnn") @NoOffset public static class LayerParams extends Dict {
        static { Loader.load(); }
        /** Default native constructor. */
        public LayerParams() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public LayerParams(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public LayerParams(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public LayerParams position(long position) {
            return (LayerParams)super.position(position);
        }
    
        /** List of learned parameters stored as blobs. */
        public native @ByRef BlobVector blobs(); public native LayerParams blobs(BlobVector blobs);

        /** Name of the layer instance (optional, can be used internal purposes). */
        public native @Str BytePointer name(); public native LayerParams name(BytePointer name);
        /** Type name which was used for creating layer by layer factory (optional). */
        public native @Str BytePointer type(); public native LayerParams type(BytePointer type);
    }

    /** \brief This interface class allows to build new Layers - are building blocks of networks.
     *
     * Each class, derived from Layer, must implement allocate() methods to declare own outputs and forward() to compute outputs.
     * Also before using the new layer into networks you must register your layer by using one of \ref LayerFactoryModule "LayerFactory" macros.
     */
    @Namespace("cv::dnn") @NoOffset public static class Layer extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Layer(Pointer p) { super(p); }
    
        /** List of learned parameters must be stored here to allow read them by using Net::getParam(). */
        public native @ByRef BlobVector blobs(); public native Layer blobs(BlobVector blobs);

        /** \brief Allocates internal buffers and output blobs with respect to the shape of inputs.
         *  @param [in]  input  vector of already allocated input blobs
         *  @param [out] output vector of output blobs, which must be allocated
         *
         * This method must create each produced blob according to shape of \p input blobs and internal layer params.
         * If this method is called first time then \p output vector consists from empty blobs and its size determined by number of output connections.
         * This method can be called multiple times if size of any \p input blob was changed.
         */
        public native @Name("allocate") void _allocate(@Const @ByRef BlobPointerVector input, @ByRef BlobVector output);

        /** \brief Given the \p input blobs, computes the output \p blobs.
         *  @param [in]  input  the input blobs.
         *  @param [out] output allocated output blobs, which will store results of the computation.
         */
        public native void forward(@ByRef BlobPointerVector input, @ByRef BlobVector output);

        /** \brief Returns index of input blob into the input array.
         *  @param inputName label of input blob
         *
         * Each layer input and output can be labeled to easily identify them using "%<layer_name%>[.output_name]" notation.
         * This method maps label of input blob to its index into input vector.
         */
        public native int inputNameToIndex(@Str BytePointer inputName);
        public native int inputNameToIndex(@Str String inputName);
        /** \brief Returns index of output blob in output array.
         *  @see inputNameToIndex()
         */
        public native int outputNameToIndex(@Str BytePointer outputName);
        public native int outputNameToIndex(@Str String outputName);

        /** Name of the layer instance, can be used for logging or other internal purposes. */
        public native @Str BytePointer name(); public native Layer name(BytePointer name);
        /** Type name which was used for creating layer by layer factory. */
        public native @Str BytePointer type(); public native Layer type(BytePointer type);
    }

    /** \brief This class allows to create and manipulate comprehensive artificial neural networks.
     *
     * Neural network is presented as directed acyclic graph (DAG), where vertices are Layer instances,
     * and edges specify relationships between layers inputs and outputs.
     *
     * Each network layer has unique integer id and unique string name inside its network.
     * LayerId can store either layer name or layer id.
     *
     * This class supports reference counting of its instances, i. e. copies point to the same instance.
     */
    @Namespace("cv::dnn") @NoOffset public static class Net extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Net(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public Net(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public Net position(long position) {
            return (Net)super.position(position);
        }
    

        /** Default constructor. */
        public Net() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** \brief Adds new layer to the net.
         *  @param name   unique name of the adding layer.
         *  @param type   typename of the adding layer (type must be registered in LayerRegister).
         *  @param params parameters which will be used to initialize the creating layer.
         *  @return unique identifier of created layer, or -1 if a failure will happen.
         */
        public native int addLayer(@Str BytePointer name, @Str BytePointer type, @ByRef LayerParams params);
        public native int addLayer(@Str String name, @Str String type, @ByRef LayerParams params);
        /** \brief Adds new layer and connects its first input to the first output of previously added layer.
         *  @see addLayer()
         */
        public native int addLayerToPrev(@Str BytePointer name, @Str BytePointer type, @ByRef LayerParams params);
        public native int addLayerToPrev(@Str String name, @Str String type, @ByRef LayerParams params);

        /** \brief Converts string name of the layer to the integer identifier.
         *  @return id of the layer, or -1 if the layer wasn't found.
         */
        public native int getLayerId(@Str BytePointer layer);
        public native int getLayerId(@Str String layer);

        /** \brief Container for strings and integers. */

        /** \brief Delete layer for the network (not implemented yet) */
        public native void deleteLayer(@ByVal @Cast("cv::dnn::Net::LayerId*") DictValue layer);

        /** \brief Connects output of the first layer to input of the second layer.
         *  @param outPin descriptor of the first layer output.
         *  @param inpPin descriptor of the second layer input.
         *
         * Descriptors have the following template <DFN>&lt;layer_name&gt;[.input_number]</DFN>:
         * - the first part of the template <DFN>layer_name</DFN> is sting name of the added layer.
         *   If this part is empty then the network input pseudo layer will be used;
         * - the second optional part of the template <DFN>input_number</DFN>
         *   is either number of the layer input, either label one.
         *   If this part is omitted then the first layer input will be used.
         *
         *  @see setNetInputs(), Layer::inputNameToIndex(), Layer::outputNameToIndex()
         */
        public native void connect(@Str BytePointer outPin, @Str BytePointer inpPin);
        public native void connect(@Str String outPin, @Str String inpPin);
        /** \brief Connects #\p outNum output of the first layer to #\p inNum input of the second layer.
         *  @param outLayerId identifier of the first layer
         *  @param inpLayerId identifier of the second layer
         *  @param outNum number of the first layer output
         *  @param inpNum number of the second layer input
         */
        public native void connect(int outLayerId, int outNum, int inpLayerId, int inpNum);
        /** \brief Sets ouputs names of the network input pseudo layer.
         *
         * Each net always has special own the network input pseudo layer with id=0.
         * This layer stores the user blobs only and don't make any computations.
         * In fact, this layer provides the only way to pass user data into the network.
         * As any other layer, this layer can label its outputs and this function provides an easy way to do this.
         */
        public native void setNetInputs(@Const @ByRef StringVector inputBlobNames);

        /** \brief Runs forward pass for the whole network */
        public native void forward();
        /** \brief Runs forward pass to compute output of layer \p toLayer */
        public native void forward(@ByVal @Cast("cv::dnn::Net::LayerId*") DictValue toLayer);
        /** \brief Runs forward pass to compute output of layer \p toLayer, but computations start from \p startLayer */
        
        /** \overload */
        

        //TODO:
        /** \brief Optimized forward.
         *  \warning Not implemented yet.
         *  \details Makes forward only those layers which weren't changed after previous forward().
         */
        
        /** \overload */
        

        /** \brief Sets the new value for the layer output blob
         *  @param outputName descriptor of the updating layer output blob.
         *  @param blob new blob.
         *  @see connect(String, String) to know format of the descriptor.
         *  \note If updating blob is not empty then \p blob must have the same shape,
         *  because network reshaping is not implemented yet.
         */
        public native void setBlob(@Str BytePointer outputName, @Const @ByRef Blob blob);
        public native void setBlob(@Str String outputName, @Const @ByRef Blob blob);
        /** \brief Returns the layer output blob.
         *  @param outputName the descriptor of the returning layer output blob.
         *  @see connect(String, String)
         */
        public native @ByVal Blob getBlob(@Str BytePointer outputName);
        public native @ByVal Blob getBlob(@Str String outputName);

        /** \brief Sets the new value for the learned param of the layer.
         *  @param layer name or id of the layer.
         *  @param numParam index of the layer parameter in the Layer::blobs array.
         *  @param blob the new value.
         *  @see Layer::blobs
         *  \note If shape of the new blob differs from the previous shape,
         *  then the following forward pass may fail.
        */
        
        /** \brief Returns parameter blob of the layer.
         *  @param layer name or id of the layer.
         *  @param numParam index of the layer parameter in the Layer::blobs array.
         *  @see Layer::blobs
         */
        public native @ByVal Blob getParam(@ByVal @Cast("cv::dnn::Net::LayerId*") DictValue layer, int numParam/*=0*/);
        public native @ByVal Blob getParam(@ByVal @Cast("cv::dnn::Net::LayerId*") DictValue layer);
    }

    /** \brief Small interface class for loading trained serialized models of different dnn-frameworks. */
    @Namespace("cv::dnn") public static class Importer extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Importer(Pointer p) { super(p); }
    

        /** \brief Adds loaded layers into the \p net and sets connetions between them. */
        public native void populateNet(@ByVal Net net);
    }

    /** \brief Creates the importer of <a href="http://caffe.berkeleyvision.org">Caffe</a> framework network.
     *  @param prototxt   path to the .prototxt file with text description of the network architecture.
     *  @param caffeModel path to the .caffemodel file with learned network.
     *  @return Pointer to the created importer, NULL in failure cases.
     */
    @Namespace("cv::dnn") public static native @Ptr Importer createCaffeImporter(@Str BytePointer prototxt, @Str BytePointer caffeModel/*=cv::String()*/);
    @Namespace("cv::dnn") public static native @Ptr Importer createCaffeImporter(@Str BytePointer prototxt);
    @Namespace("cv::dnn") public static native @Ptr Importer createCaffeImporter(@Str String prototxt, @Str String caffeModel/*=cv::String()*/);
    @Namespace("cv::dnn") public static native @Ptr Importer createCaffeImporter(@Str String prototxt);

    /** \brief Creates the importer of <a href="http://torch.ch">Torch7</a> framework network.
     *  @param filename path to the file, dumped from Torch by using torch.save() function.
     *  @param isBinary specifies whether the network was serialized in ascii mode or binary.
     *  @return Pointer to the created importer, NULL in failure cases.
     *
     *  \warning Torch7 importer is experimental now, you need explicitly set CMake opencv_dnn_BUILD_TORCH_IMPORTER flag to compile its.
     *
     *  \note Ascii mode of Torch serializer is more preferable, because binary mode extensively use long type of C language,
     *  which has different bit-length on different systems.
     *
     * The loading file must contain serialized <a href="https://github.com/torch/nn/blob/master/doc/module.md">nn.Module</a> object
     * with importing network. Try to eliminate a custom objects from serialazing data to avoid importing errors.
     *
     * List of supported layers (i.e. object instances derived from Torch nn.Module class):
     * - nn.Sequential
     * - nn.Parallel
     * - nn.Concat
     * - nn.Linear
     * - nn.SpatialConvolution
     * - nn.SpatialMaxPooling, nn.SpatialAveragePooling
     * - nn.ReLU, nn.TanH, nn.Sigmoid
     * - nn.Reshape
     *
     * Also some equivalents of these classes from cunn, cudnn, and fbcunn may be successfully imported.
     */
    @Namespace("cv::dnn") public static native @Ptr Importer createTorchImporter(@Str BytePointer filename, @Cast("bool") boolean isBinary/*=true*/);
    @Namespace("cv::dnn") public static native @Ptr Importer createTorchImporter(@Str BytePointer filename);
    @Namespace("cv::dnn") public static native @Ptr Importer createTorchImporter(@Str String filename, @Cast("bool") boolean isBinary/*=true*/);
    @Namespace("cv::dnn") public static native @Ptr Importer createTorchImporter(@Str String filename);

    /** \brief Loads blob which was serialized as torch.Tensor object of Torch7 framework.
     *  \warning This function has the same limitations as createTorchImporter().
     */
    

/** \} */



// #include <opencv2/dnn/layer.hpp>
// #include <opencv2/dnn/dnn.inl.hpp>

// #endif  /* __OPENCV_DNN_DNN_HPP__ */


// Parsed from <opencv2/dnn/layer.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_DNN_LAYER_HPP__
// #define __OPENCV_DNN_LAYER_HPP__
// #include <opencv2/dnn.hpp>
/** \addtogroup dnn
 *  \{
 * 
 *  \defgroup LayerFactoryModule Utilities for new layers registration
 *  \{
<p>
/** \brief %Layer factory allows to create instances of registered layers. */
@Namespace("cv::dnn") public static class LayerFactory extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LayerFactory(Pointer p) { super(p); }


    /** Each Layer class must provide this function to the factory */
    @Convention(value="", extern="C++") public static class Constuctor extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Constuctor(Pointer p) { super(p); }
        protected Constuctor() { allocate(); }
        private native void allocate();
        public native @Ptr Layer call(@ByRef LayerParams params);
    }

    /** Registers the layer class with typename \p type and specified \p constructor. */
    public static native void registerLayer(@Str BytePointer type, Constuctor constructor);
    public static native void registerLayer(@Str String type, Constuctor constructor);

    /** Unregisters registered layer with specified type name. */
    public static native void unregisterLayer(@Str BytePointer type);
    public static native void unregisterLayer(@Str String type);

    /** \brief Creates instance of registered layer.
     *  @param type type name of creating layer.
     *  @param params parameters which will be used for layer initialization.
     */
    public static native @Ptr Layer createLayerInstance(@Str BytePointer type, @ByRef LayerParams params);
    public static native @Ptr Layer createLayerInstance(@Str String type, @ByRef LayerParams params);
}

/** \brief Registers layer constructor in runtime.
*   @param type string, containing type name of the layer.
*   @param constuctorFunc pointer to the function of type LayerRegister::Constuctor, which creates the layer.
*   \details This macros must be placed inside the function code.
*/
// #define REG_RUNTIME_LAYER_FUNC(type, constuctorFunc)
//     LayerFactory::registerLayer(#type, constuctorFunc);

/** \brief Registers layer class in runtime.
 *  @param type string, containing type name of the layer.
 *  @param class C++ class, derived from Layer.
 *  \details This macros must be placed inside the function code.
 */
// #define REG_RUNTIME_LAYER_CLASS(type, class)
//     LayerFactory::registerLayer(#type, _layerDynamicRegisterer<class>);

/** \brief Registers layer constructor on module load time.
*   @param type string, containing type name of the layer.
*   @param constuctorFunc pointer to the function of type LayerRegister::Constuctor, which creates the layer.
*   \details This macros must be placed outside the function code.
*/
// #define REG_STATIC_LAYER_FUNC(type, constuctorFunc)
// static _LayerStaticRegisterer __LayerStaticRegisterer_##type(#type, constuctorFunc);

/** \brief Registers layer class on module load time.
 *  @param type string, containing type name of the layer.
 *  @param class C++ class, derived from Layer.
 *  \details This macros must be placed outside the function code.
 */
// #define REG_STATIC_LAYER_CLASS(type, class)
// Ptr<Layer> __LayerStaticRegisterer_func_##type(LayerParams &params)
//     { return Ptr<Layer>(new class(params)); }
// static _LayerStaticRegisterer __LayerStaticRegisterer_##type(#type, __LayerStaticRegisterer_func_##type);


/** \}
 *  \} */

//allows automatically register created layer on module load time
@Namespace("cv::dnn") @NoOffset public static class _LayerStaticRegisterer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _LayerStaticRegisterer(Pointer p) { super(p); }

    public native @Str BytePointer type(); public native _LayerStaticRegisterer type(BytePointer type);

    public _LayerStaticRegisterer(@Str BytePointer type, LayerFactory.Constuctor constuctor) { super((Pointer)null); allocate(type, constuctor); }
    private native void allocate(@Str BytePointer type, LayerFactory.Constuctor constuctor);
    public _LayerStaticRegisterer(@Str String type, LayerFactory.Constuctor constuctor) { super((Pointer)null); allocate(type, constuctor); }
    private native void allocate(@Str String type, LayerFactory.Constuctor constuctor);
}



// #endif


}
