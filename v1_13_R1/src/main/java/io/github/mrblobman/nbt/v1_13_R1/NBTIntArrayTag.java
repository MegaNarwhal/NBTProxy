/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 MrBlobman
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.github.mrblobman.nbt.v1_13_R1;

import io.github.mrblobman.nbt.NBTBaseTag;
import io.github.mrblobman.nbt.NBTType;
import net.minecraft.server.v1_13_R1.NBTTagIntArray;

public class NBTIntArrayTag extends NBTBaseTag<int[]> {
    private NBTTagIntArray nmsTag;

    public NBTIntArrayTag(int[] value) {
        super(new NBTTagIntArray(value));
        this.nmsTag = (NBTTagIntArray) super.getHandle();
    }

    public NBTIntArrayTag(NBTTagIntArray nmsTag) {
        super(nmsTag);
        this.nmsTag = (NBTTagIntArray) super.getHandle();
    }

    @Override
    public NBTType<int[]> type() {
        return NBTType.INT_ARRAY;
    }

    @Override
    public int[] get() {
        return nmsTag.d();
    }
}
