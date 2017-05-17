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

import com.billyyccc.compositedemo.safecompositepattern.Directory;
import com.billyyccc.compositedemo.safecompositepattern.File;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/5/17.
 * Email: billy112487983@gmail.com
 */

public class SafeCompositePatternTest {
    @Test
    public void safeCompositePatternTest() {
        Directory userDirectory = new Directory("Users");
        Directory administratorDirectory = new Directory("administrator");
        Directory guestDirectory = new Directory("guest");

        Directory videoDirectory = new Directory("Video");
        Directory musicDirectory = new Directory("Music");
        Directory picturesDirectory = new Directory("Picture");

        File logFile = new File("logs.txt");

        File musicFile1 = new File("Piano.mp3");
        File musicFile2 = new File("Violin.mp3");

        File videoFile1 = new File("NBA.mp4");
        File videoFile2 = new File("WorldCup.mp4");

        File pictureFile1 = new File("the Great Wall.jpg");

        userDirectory.addDirectory(administratorDirectory);
        userDirectory.addDirectory(guestDirectory);

        administratorDirectory.addDirectory(videoDirectory);
        administratorDirectory.addDirectory(musicDirectory);
        administratorDirectory.addDirectory(picturesDirectory);
        administratorDirectory.addFile(logFile);

        videoDirectory.addFile(videoFile1);
        videoDirectory.addFile(videoFile2);

        musicDirectory.addFile(musicFile1);
        musicDirectory.addFile(musicFile2);

        picturesDirectory.addFile(pictureFile1);

        userDirectory.listAbstractFiles();
    }
}
