package com.polstat.sipadungv2.rpc;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Windows10
 */
@Setter
@Getter
public class JsonRpcRequest {
    private String jsonrpc;
    private String method;
    private JsonNode params;
    private String id;
    
}
