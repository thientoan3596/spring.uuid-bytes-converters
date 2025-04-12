package com.github.thientoan3596;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

import java.nio.ByteBuffer;
import java.util.UUID;

@ReadingConverter
public class BytesToUUIDConverter implements Converter<byte[], UUID> {
    @Override
    public UUID convert(final byte[] source) {
        return BytesToUUIDConverter.CONVERT(source);
    }
    public static UUID CONVERT(final byte[] source) {
        final ByteBuffer bb = ByteBuffer.wrap(source);
        final Long firstLong = bb.getLong();
        final Long secondLong = bb.getLong();
        return new UUID(firstLong, secondLong);
    }
}

