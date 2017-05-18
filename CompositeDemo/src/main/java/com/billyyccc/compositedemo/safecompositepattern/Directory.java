/*
 * MIT License
 *
 * Copyright (c) 2017 BillyYuan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.billyyccc.compositedemo.safecompositepattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Billy Yuan on 2017/5/17.
 * Email: billy112487983@gmail.com
 */

public class Directory extends AbstractFile {
    protected List<AbstractFile> abstractFilesList = new ArrayList<>();


    public Directory(String name) {
        super(name);
    }

    public void addAbstractFile(AbstractFile abstractFile) {
        abstractFilesList.add(abstractFile);
    }

    public void removeAbstractFile(AbstractFile abstractFile) {
        abstractFilesList.remove(abstractFile);
    }

    public void removeAllFiles() {
        abstractFilesList.clear();
    }

    @Override
    public void listAbstractFiles() {
        System.out.print(getName() + "{");
        Iterator<AbstractFile> iterator = abstractFilesList.iterator();
        while (iterator.hasNext()) {
            AbstractFile abstractFile = iterator.next();
            abstractFile.listAbstractFiles();
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
