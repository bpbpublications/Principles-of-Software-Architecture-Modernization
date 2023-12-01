package com.github.diegopacheco.fixingmonoliths.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class StringToListUUID implements Converter<String, List<UUID>> {
    @Override
    public List<UUID> convert(@NonNull String uuids) {
        List<UUID> result = Arrays.stream(uuids.split(",")).
                map( u -> UUID.fromString(u) ).
                collect(Collectors.toList());
        return result;
    }
}

