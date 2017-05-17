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

package com.billyyccc.singletondemotest;

import com.billyyccc.singletondemo.EnumSingleton;
import com.billyyccc.singletondemo.SerializeSingletonA;
import com.billyyccc.singletondemo.SerializeSingletonB;
import org.junit.Test;

import java.io.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;


/**
 * Created by Billy Yuan on 2017/4/27.
 * Email: billy112487983@gmail.com
 */

public class SingletonSerializedTest {
    @Test
    public void serializedSingletonATest() throws IOException, ClassNotFoundException {
        SerializeSingletonA instanceA = SerializeSingletonA.getInstance();
        //Serialize Object to File
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.test"));
        out.writeObject(instanceA);
        out.close();

        //Deserialize from File to Object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.test"));
        SerializeSingletonA instanceB = (SerializeSingletonA) in.readObject();
        in.close();

        //判断两个实例是否相同
        assertThat(instanceA.hashCode(), not(instanceB.hashCode()));
    }

    @Test
    public void serializedSingletonBTest() throws IOException, ClassNotFoundException {
        SerializeSingletonB instanceA = SerializeSingletonB.getInstance();
        //Serialize Object to File
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename2.test"));
        out.writeObject(instanceA);
        out.close();

        //Deserialize from File to Object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename2.test"));
        SerializeSingletonB instanceB = (SerializeSingletonB) in.readObject();
        in.close();

        //判断两个实例是否相同
        assertThat(instanceA.hashCode(), is(instanceB.hashCode()));
    }

    //枚举类型单例序列化和反序列化不会出现异常
    @Test
    public void serializedSingletonEnumTest() throws IOException, ClassNotFoundException {
        EnumSingleton instanceA = EnumSingleton.INSTANCE;
        //Serialize Object to File
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename3.test"));
        out.writeObject(instanceA);
        out.close();

        //Deserialize from File to Object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename3.test"));
        EnumSingleton instanceB = (EnumSingleton) in.readObject();
        in.close();

        //判断两个实例是否相同
        assertThat(instanceA.hashCode(), is(instanceB.hashCode()));
    }
}
