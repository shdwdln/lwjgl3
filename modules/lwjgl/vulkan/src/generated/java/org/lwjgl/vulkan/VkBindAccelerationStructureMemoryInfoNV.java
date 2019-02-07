/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying acceleration structure memory binding.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code accelerationStructure} <b>must</b> not already be backed by a memory object</li>
 * <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
 * <li>{@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the {@link VkMemoryRequirements} structure returned from a call to {@link NVRayTracing#vkGetAccelerationStructureMemoryRequirementsNV GetAccelerationStructureMemoryRequirementsNV} with {@code accelerationStructure} and {@code type} of {@link NVRayTracing#VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV}</li>
 * <li>{@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the {@link VkMemoryRequirements} structure returned from a call to {@link NVRayTracing#vkGetAccelerationStructureMemoryRequirementsNV GetAccelerationStructureMemoryRequirementsNV} with {@code accelerationStructure} and {@code type} of {@link NVRayTracing#VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV}</li>
 * <li>The {@code size} member of the {@link VkMemoryRequirements} structure returned from a call to {@link NVRayTracing#vkGetAccelerationStructureMemoryRequirementsNV GetAccelerationStructureMemoryRequirementsNV} with {@code accelerationStructure} and {@code type} of {@link NVRayTracing#VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV} <b>must</b> be less than or equal to the size of {@code memory} minus {@code memoryOffset}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVRayTracing#VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code accelerationStructure} <b>must</b> be a valid {@code VkAccelerationStructureNV} handle</li>
 * <li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * <li>If {@code deviceIndexCount} is not 0, {@code pDeviceIndices} <b>must</b> be a valid pointer to an array of {@code deviceIndexCount} {@code uint32_t} values</li>
 * <li>Both of {@code accelerationStructure}, and {@code memory} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVRayTracing#vkBindAccelerationStructureMemoryNV BindAccelerationStructureMemoryNV}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code accelerationStructure} &ndash; the acceleration structure to be attached to memory.</li>
 * <li>{@code memory} &ndash; a {@code VkDeviceMemory} object describing the device memory to attach.</li>
 * <li>{@code memoryOffset} &ndash; the start offset of the region of memory that is to be bound to the acceleration structure. The number of bytes returned in the {@link VkMemoryRequirements}{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified acceleration structure.</li>
 * <li>{@code deviceIndexCount} &ndash; the number of elements in {@code pDeviceIndices}.</li>
 * <li>{@code pDeviceIndices} &ndash; a pointer to an array of device indices.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindAccelerationStructureMemoryInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAccelerationStructureNV accelerationStructure;
 *     VkDeviceMemory memory;
 *     VkDeviceSize memoryOffset;
 *     uint32_t deviceIndexCount;
 *     uint32_t const * pDeviceIndices;
 * }</code></pre>
 */
public class VkBindAccelerationStructureMemoryInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ACCELERATIONSTRUCTURE,
        MEMORY,
        MEMORYOFFSET,
        DEVICEINDEXCOUNT,
        PDEVICEINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURE = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
        DEVICEINDEXCOUNT = layout.offsetof(5);
        PDEVICEINDICES = layout.offsetof(6);
    }

    /**
     * Creates a {@link VkBindAccelerationStructureMemoryInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindAccelerationStructureMemoryInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code accelerationStructure} field. */
    @NativeType("VkAccelerationStructureNV")
    public long accelerationStructure() { return naccelerationStructure(address()); }
    /** Returns the value of the {@code memory} field. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** Returns the value of the {@code memoryOffset} field. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }
    /** Returns the value of the {@code deviceIndexCount} field. */
    @NativeType("uint32_t")
    public int deviceIndexCount() { return ndeviceIndexCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pDeviceIndices() { return npDeviceIndices(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindAccelerationStructureMemoryInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindAccelerationStructureMemoryInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code accelerationStructure} field. */
    public VkBindAccelerationStructureMemoryInfoNV accelerationStructure(@NativeType("VkAccelerationStructureNV") long value) { naccelerationStructure(address(), value); return this; }
    /** Sets the specified value to the {@code memory} field. */
    public VkBindAccelerationStructureMemoryInfoNV memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@code memoryOffset} field. */
    public VkBindAccelerationStructureMemoryInfoNV memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
    public VkBindAccelerationStructureMemoryInfoNV pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npDeviceIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindAccelerationStructureMemoryInfoNV set(
        int sType,
        long pNext,
        long accelerationStructure,
        long memory,
        long memoryOffset,
        @Nullable IntBuffer pDeviceIndices
    ) {
        sType(sType);
        pNext(pNext);
        accelerationStructure(accelerationStructure);
        memory(memory);
        memoryOffset(memoryOffset);
        pDeviceIndices(pDeviceIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindAccelerationStructureMemoryInfoNV set(VkBindAccelerationStructureMemoryInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkBindAccelerationStructureMemoryInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindAccelerationStructureMemoryInfoNV malloc() {
        return wrap(VkBindAccelerationStructureMemoryInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkBindAccelerationStructureMemoryInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindAccelerationStructureMemoryInfoNV calloc() {
        return wrap(VkBindAccelerationStructureMemoryInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkBindAccelerationStructureMemoryInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkBindAccelerationStructureMemoryInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindAccelerationStructureMemoryInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@link VkBindAccelerationStructureMemoryInfoNV} instance for the specified memory address. */
    public static VkBindAccelerationStructureMemoryInfoNV create(long address) {
        return wrap(VkBindAccelerationStructureMemoryInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindAccelerationStructureMemoryInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkBindAccelerationStructureMemoryInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkBindAccelerationStructureMemoryInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBindAccelerationStructureMemoryInfoNV mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkBindAccelerationStructureMemoryInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBindAccelerationStructureMemoryInfoNV callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindAccelerationStructureMemoryInfoNV mallocStack(MemoryStack stack) {
        return wrap(VkBindAccelerationStructureMemoryInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindAccelerationStructureMemoryInfoNV callocStack(MemoryStack stack) {
        return wrap(VkBindAccelerationStructureMemoryInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindAccelerationStructureMemoryInfoNV.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBindAccelerationStructureMemoryInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindAccelerationStructureMemoryInfoNV.PNEXT); }
    /** Unsafe version of {@link #accelerationStructure}. */
    public static long naccelerationStructure(long struct) { return UNSAFE.getLong(null, struct + VkBindAccelerationStructureMemoryInfoNV.ACCELERATIONSTRUCTURE); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkBindAccelerationStructureMemoryInfoNV.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return UNSAFE.getLong(null, struct + VkBindAccelerationStructureMemoryInfoNV.MEMORYOFFSET); }
    /** Unsafe version of {@link #deviceIndexCount}. */
    public static int ndeviceIndexCount(long struct) { return UNSAFE.getInt(null, struct + VkBindAccelerationStructureMemoryInfoNV.DEVICEINDEXCOUNT); }
    /** Unsafe version of {@link #pDeviceIndices() pDeviceIndices}. */
    @Nullable public static IntBuffer npDeviceIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkBindAccelerationStructureMemoryInfoNV.PDEVICEINDICES), ndeviceIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBindAccelerationStructureMemoryInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindAccelerationStructureMemoryInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #accelerationStructure(long) accelerationStructure}. */
    public static void naccelerationStructure(long struct, long value) { UNSAFE.putLong(null, struct + VkBindAccelerationStructureMemoryInfoNV.ACCELERATIONSTRUCTURE, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkBindAccelerationStructureMemoryInfoNV.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBindAccelerationStructureMemoryInfoNV.MEMORYOFFSET, value); }
    /** Sets the specified value to the {@code deviceIndexCount} field of the specified {@code struct}. */
    public static void ndeviceIndexCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindAccelerationStructureMemoryInfoNV.DEVICEINDEXCOUNT, value); }
    /** Unsafe version of {@link #pDeviceIndices(IntBuffer) pDeviceIndices}. */
    public static void npDeviceIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkBindAccelerationStructureMemoryInfoNV.PDEVICEINDICES, memAddressSafe(value)); ndeviceIndexCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (ndeviceIndexCount(struct) != 0) {
            check(memGetAddress(struct + VkBindAccelerationStructureMemoryInfoNV.PDEVICEINDICES));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkBindAccelerationStructureMemoryInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkBindAccelerationStructureMemoryInfoNV, Buffer> implements NativeResource {

        private static final VkBindAccelerationStructureMemoryInfoNV ELEMENT_FACTORY = VkBindAccelerationStructureMemoryInfoNV.create(-1L);

        /**
         * Creates a new {@link VkBindAccelerationStructureMemoryInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindAccelerationStructureMemoryInfoNV#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkBindAccelerationStructureMemoryInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindAccelerationStructureMemoryInfoNV.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindAccelerationStructureMemoryInfoNV.npNext(address()); }
        /** Returns the value of the {@code accelerationStructure} field. */
        @NativeType("VkAccelerationStructureNV")
        public long accelerationStructure() { return VkBindAccelerationStructureMemoryInfoNV.naccelerationStructure(address()); }
        /** Returns the value of the {@code memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkBindAccelerationStructureMemoryInfoNV.nmemory(address()); }
        /** Returns the value of the {@code memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkBindAccelerationStructureMemoryInfoNV.nmemoryOffset(address()); }
        /** Returns the value of the {@code deviceIndexCount} field. */
        @NativeType("uint32_t")
        public int deviceIndexCount() { return VkBindAccelerationStructureMemoryInfoNV.ndeviceIndexCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pDeviceIndices} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pDeviceIndices() { return VkBindAccelerationStructureMemoryInfoNV.npDeviceIndices(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindAccelerationStructureMemoryInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkBindAccelerationStructureMemoryInfoNV.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindAccelerationStructureMemoryInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkBindAccelerationStructureMemoryInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code accelerationStructure} field. */
        public VkBindAccelerationStructureMemoryInfoNV.Buffer accelerationStructure(@NativeType("VkAccelerationStructureNV") long value) { VkBindAccelerationStructureMemoryInfoNV.naccelerationStructure(address(), value); return this; }
        /** Sets the specified value to the {@code memory} field. */
        public VkBindAccelerationStructureMemoryInfoNV.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkBindAccelerationStructureMemoryInfoNV.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@code memoryOffset} field. */
        public VkBindAccelerationStructureMemoryInfoNV.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkBindAccelerationStructureMemoryInfoNV.nmemoryOffset(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pDeviceIndices} field. */
        public VkBindAccelerationStructureMemoryInfoNV.Buffer pDeviceIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBindAccelerationStructureMemoryInfoNV.npDeviceIndices(address(), value); return this; }

    }

}