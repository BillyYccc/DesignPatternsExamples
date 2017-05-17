/*
 * MIT License
 *
 * Copyright (c) 2017 BillyYuan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.billyyccc.prototypedemo.copy.deepcopy;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Billy Yuan on 2017/5/9.
 * Email: billy112487983@gmail.com
 */

public class Bookshelf implements Cloneable {
    private ArrayList<Magazine> bookList;

    public ArrayList<Magazine> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Magazine> bookList) {
        this.bookList = bookList;
    }

    public Bookshelf(ArrayList<Magazine> bookList) {
        this.bookList = bookList;
        this.bookList.add(new Magazine("magazine1", 100));
        this.bookList.add(new Magazine("magazine2", 200));
        this.bookList.add(new Magazine("magazine3", 300));
        this.bookList.add(new Magazine("magazine4", 400));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Bookshelf bookshelf = null;
        bookshelf = (Bookshelf) super.clone();

        ArrayList<Magazine> newBookList = new ArrayList<>();
        for (Magazine magazine : bookList) {
            try {
                newBookList.add(magazine.deepClone());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        bookshelf.setBookList(newBookList);
        return bookshelf;
    }
}
