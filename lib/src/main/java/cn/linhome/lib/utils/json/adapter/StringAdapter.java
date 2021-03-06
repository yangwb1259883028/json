package cn.linhome.lib.utils.json.adapter;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class StringAdapter implements JsonDeserializer<String>
{
    @Override
    public String deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
    {
        if (json.isJsonObject())
            return json.getAsJsonObject().toString();
        if (json.isJsonArray())
            return json.getAsJsonArray().toString();

        return json.getAsString();
    }
}
