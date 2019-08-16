package org.mvnsearch;

import org.junit.jupiter.api.Test;

import java.nio.ByteBuffer;

/**
 * byte buffer test
 *
 * @author linux_china
 */
public class ByteBufferTest {

    @Test
    public void testPutBatch() {
        ByteBuffer buffer = ByteBuffer.allocate(128);
        buffer.put(0, "demo".getBytes());
        byte[] content = new byte[4];
        buffer.get(0,content);
        System.out.println(new String(content));
    }
}
