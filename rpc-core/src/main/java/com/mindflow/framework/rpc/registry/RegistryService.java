package com.mindflow.framework.rpc.registry;

import com.mindflow.framework.rpc.common.URL;

/**
 * @author Ricky Fung
 */
public interface RegistryService {

    /**
     * register service to registry
     *
     * @param url
     */
    void register(URL url) throws Exception;

    /**
     * unregister service to registry
     *
     * @param url
     */
    void unregister(URL url) throws Exception;

}
