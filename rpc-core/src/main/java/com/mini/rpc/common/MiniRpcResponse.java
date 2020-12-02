package com.mini.rpc.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class MiniRpcResponse implements Serializable {
    private String requestId;
    private Object data;
    private String message;
}