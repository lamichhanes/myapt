package com.myapt.models.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class StorageUnitResponse implements Serializable {

    private String trackingId;
    private Object response;
    private List<String> errors;

}
