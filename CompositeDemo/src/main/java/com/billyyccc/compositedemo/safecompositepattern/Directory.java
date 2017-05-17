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
    //TODO Use Iterator Pattern to refactor
    private List<Directory> diretories = new ArrayList<>();
    private List<File> files = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addDirectory(Directory directory) {
        diretories.add(directory);
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeDirectory(Directory directory) {
        diretories.remove(directory);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    public void revoveAllDirectories() {
        diretories.clear();
    }

    public void revoveAllFiles() {
        files.clear();
    }

    @Override
    public void listAbstractFiles() {
        System.out.print(getName() + "{");
        Iterator<Directory> directoryIterator = diretories.iterator();
        Iterator<File> fileIterator = files.iterator();

        while (directoryIterator.hasNext()) {
            Directory directory = directoryIterator.next();
            directory.listAbstractFiles();
            if (directoryIterator.hasNext()) {
                System.out.print(",");
            }
        }

        while (fileIterator.hasNext()) {
            File file = fileIterator.next();
            file.listAbstractFiles();
            if (fileIterator.hasNext()) {
                System.out.print(",");
            }
        }

        System.out.print("}");
    }
}
