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
package io.github.mrblobman.nbt.v1_13_R2;

import io.github.mrblobman.nbt.NBTBaseTag;
import io.github.mrblobman.nbt.NBTType;
import net.minecraft.server.v1_13_R2.NBTTagString;

public class NBTStringTag extends NBTBaseTag<String> {
    private NBTTagString nmsTag;

    public NBTStringTag(String value) {
        super(new NBTTagString(value));
        this.nmsTag = (NBTTagString) super.getHandle();
    }

    public NBTStringTag(NBTTagString nmsTag) {
        super(nmsTag);
        this.nmsTag = (NBTTagString) super.getHandle();
    }

    @Override
    public NBTType<String> type() {
        return NBTType.STRING;
    }

    @Override
    public String get() {
        return nmsTag.b_();
    }
}
