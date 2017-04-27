import org.junit.Test;

import java.io.*;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;


/**
 * Created by Billy Yuan on 2017/4/27.
 * Email: billy112487983@gmail.com
 */

public class SingletonSerializedTest {
    @Test
    public void serializedSingletonATest() throws IOException, FileNotFoundException,
            ClassNotFoundException {
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
}
