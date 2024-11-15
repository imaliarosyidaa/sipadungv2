package com.polstat.sipadungv2.rpc;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Windows10
 */
@Setter
@Getter
public class JsonRpcResponse {
    private String jsonrpc;
    private Object result;
    private Object error;
    private String id;

    public JsonRpcResponse(Object result, String id) {
        this.result = result;
        this.id = id;
    }
    
}
