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

package com.billyyccc.compositedemotest;

import com.billyyccc.compositedemo.transparentcompositepattern.AbstractFile;
import com.billyyccc.compositedemo.transparentcompositepattern.Directory;
import com.billyyccc.compositedemo.transparentcompositepattern.File;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/17.
 * Email: billy112487983@gmail.com
 */

public class TransparentCompositePatternTest {
    @Test
    public void transparentCompositePatternTest() {
        AbstractFile userDirectory = new Directory("Users");
        AbstractFile administratorDirectory = new Directory("administrator");
        AbstractFile guestDirectory = new Directory("guest");

        AbstractFile videoDirectory = new Directory("Video");
        AbstractFile musicDirectory = new Directory("Music");
        AbstractFile picturesDirectory = new Directory("Picture");

        AbstractFile logFile = new File("logs.txt");

        AbstractFile musicFile1 = new File("Piano.mp3");
        AbstractFile musicFile2 = new File("Violin.mp3");

        AbstractFile videoFile1 = new File("NBA.mp4");
        AbstractFile videoFile2 = new File("WorldCup.mp4");

        AbstractFile pictureFile1 = new File("the Great Wall.jpg");

        userDirectory.addAbstractFile(administratorDirectory);
        userDirectory.addAbstractFile(guestDirectory);

        administratorDirectory.addAbstractFile(videoDirectory);
        administratorDirectory.addAbstractFile(musicDirectory);
        administratorDirectory.addAbstractFile(picturesDirectory);
        administratorDirectory.addAbstractFile(logFile);

        videoDirectory.addAbstractFile(videoFile1);
        videoDirectory.addAbstractFile(videoFile2);

        musicDirectory.addAbstractFile(musicFile1);
        musicDirectory.addAbstractFile(musicFile2);

        picturesDirectory.addAbstractFile(pictureFile1);

        userDirectory.listAbstractFiles();
    }
}
