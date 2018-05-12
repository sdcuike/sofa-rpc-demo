package com.sdcuike.extensionloader;

import com.alipay.sofa.rpc.ext.Extensible;

/**
 * @author sdcuike
 * @date 2018/5/12
 */
@Extensible
public interface DemoService {

    String hello(String name);
}
