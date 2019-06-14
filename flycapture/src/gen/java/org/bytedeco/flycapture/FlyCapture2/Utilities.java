// Targeted by JavaCPP version 1.5: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


	/**
	 * The Utility class is generally used to query for general system
	 * information such as operating system, available memory etc.
	 * It can also be used to launch browsers, CHM viewers or terminal commands.
	 */
	@Namespace("FlyCapture2") @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class Utilities extends Pointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public Utilities(Pointer p) { super(p); }
	

			/**
			 * Check for driver compatibility for the given camera guid.
			 *
			 * @param guid Pointer to the guid of the device to check.
			 *
			 * @return PGR_NO_ERROR if the library is compatible with the currently
			 *         loaded driver, otherwise an error indicating the type of failure.
			 */
			public static native @ByVal Error CheckDriver(@Const PGRGuid guid);

			/**
			 * Get the driver's name for a device
			 *
			 * @param guid Pointer to the guid of the device to check.
			 * @param deviceName The device name will be returned in this string
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public static native @ByVal Error GetDriverDeviceName(@Const PGRGuid guid, @StdString @ByRef BytePointer deviceName);

			/**
			 * Get system information.
			 *
			 * @param pSystemInfo Structure to receive system information.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public static native @ByVal Error GetSystemInfo(
								SystemInfo pSystemInfo );

			/**
			 * Get library version.
			 *
			 * @param pVersion Structure to receive the library version.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public static native @ByVal Error GetLibraryVersion(
								FC2Version pVersion );

			/**
			 * Launch a URL in the system default browser.
			 *
			 * @param pAddress URL to open in browser.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public static native @ByVal Error LaunchBrowser(
								@Cast("const char*") BytePointer pAddress );
			public static native @ByVal Error LaunchBrowser(
								String pAddress );

			/**
			 * Open a CHM file in the system default CHM viewer.
			 *
			 * @param pFileName Filename of CHM file to open.
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public static native @ByVal Error LaunchHelp(
								@Cast("const char*") BytePointer pFileName );
			public static native @ByVal Error LaunchHelp(
								String pFileName );

			/**
			 * Execute a command in the terminal. This is a blocking call that
			 * will return when the command completes.
			 *
			 * @param pCommand Command to execute.
			 *
			 * @see LaunchCommandAsync()
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public static native @ByVal Error LaunchCommand(
								@Cast("const char*") BytePointer pCommand );
			public static native @ByVal Error LaunchCommand(
								String pCommand );

			/**
			 * Execute a command in the terminal. This is a non-blocking call that
			 * will return immediately. The return value of the command can be
			 * retrieved in the callback.
			 *
			 * @param pCommand Command to execute.
			 * @param pCallback Callback to fire when command is complete.
			 * @param pUserData Data pointer to pass to callback.
			 *
			 * @see LaunchCommand()
			 *
			 * @return An Error indicating the success or failure of the function.
			 */
			public static native @ByVal Error LaunchCommandAsync(
								@Cast("const char*") BytePointer pCommand,
								AsyncCommandCallback pCallback,
								Pointer pUserData );
			public static native @ByVal Error LaunchCommandAsync(
								String pCommand,
								AsyncCommandCallback pCallback,
								Pointer pUserData );

	}