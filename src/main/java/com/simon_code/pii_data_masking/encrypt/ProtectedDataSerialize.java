package com.simon_code.pii_data_masking.encrypt;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class ProtectedDataSerialize extends JsonSerializer<Object> {

    @Override
    public void serialize(Object value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        String pii =(String)value;
        String x = pii.replaceAll("\\w(?=\\w{4})", "x");
        gen.writeString(x);

    }
}
