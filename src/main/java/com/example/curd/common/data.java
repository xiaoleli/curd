package com.example.curd.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class data<T> {
    private T table;
    public data() {
    }
}
