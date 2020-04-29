// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief FileSystemSourceFactory creates a Source from a vector of
 *  fs::FileStats or a fs::FileSelector. */
@Namespace("arrow::dataset") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class FileSystemSourceFactory extends SourceFactory {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileSystemSourceFactory(Pointer p) { super(p); }

  /** \brief Build a FileSystemSourceFactory from an explicit list of
   *  paths.
   * 
   *  @param filesystem [in] passed to FileSystemSource
   *  @param paths [in] passed to FileSystemSource
   *  @param format [in] passed to FileSystemSource
   *  @param options [in] see FileSystemFactoryOptions for more information. */
  
  ///
  ///
  public static native @ByVal SourceFactoryResult Make(
        @SharedPtr FileSystem filesystem, @Const @ByRef StringVector paths,
        @SharedPtr FileFormat format, @ByVal FileSystemFactoryOptions options);

  /** \brief Build a FileSystemSourceFactory from a fs::FileSelector.
   * 
   *  The selector will expand to a vector of FileStats. The expansion/crawling
   *  is performed in this function call. Thus, the finalized Source is
   *  working with a snapshot of the filesystem. */
  //
  /** If options.partition_base_dir is not provided, it will be overwritten
  /** with selector.base_dir.
  /**
  /** @param filesystem [in] passed to FileSystemSource
  /** @param selector [in] used to crawl and search files
  /** @param format [in] passed to FileSystemSource
  /** @param options [in] see FileSystemFactoryOptions for more information. */
  public static native @ByVal SourceFactoryResult Make(
        @SharedPtr FileSystem filesystem, @ByVal FileSelector selector,
        @SharedPtr FileFormat format, @ByVal FileSystemFactoryOptions options);

  public native @ByVal SchemaVectorResult InspectSchemas();

  public native @ByVal SourceResult Finish(@Const @SharedPtr @ByRef Schema schema);
}