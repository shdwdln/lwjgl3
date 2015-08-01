/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.egl.templates

import org.lwjgl.generator.*
import org.lwjgl.egl.*

val KHR_stream_consumer_gltexture = "KHRStreamConsumerGLTexture".nativeClassEGL("KHR_stream_consumer_gltexture", postfix = KHR) {
	includeEGLEXT()

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension allows an OpenGL(ES) texture to be connected to an EGLStream as its consumer. Image frames from the EGLStream can be 'latched' into the
		texture as the contents of the texture. This is equivalent to copying the image into the texture, but on most implementations a copy is not needed so
		this is faster.

		Requires ${EGL12.core}.
		"""

	IntConstant(
		"",

		"CONSUMER_ACQUIRE_TIMEOUT_USEC_KHR" _ 0x321E
	)

	EGLBoolean(
		"StreamConsumerGLTextureExternalKHR",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLStreamKHR.IN("stream", "")
	)

	EGLBoolean(
		"StreamConsumerAcquireKHR",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLStreamKHR.IN("stream", "")
	)

	EGLBoolean(
		"StreamConsumerReleaseKHR",
		"",

		EGLDisplay.IN("dpy", ""),
		EGLStreamKHR.IN("stream", "")
	)
}