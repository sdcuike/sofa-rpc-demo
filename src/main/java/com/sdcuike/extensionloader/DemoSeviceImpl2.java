package com.sdcuike.extensionloader;

import com.alipay.sofa.rpc.ext.Extension;

/**
 * @author sdcuike
 * @date 2018/5/12
 */
@Extension("demoSeviceImpl2")
public class DemoSeviceImpl2 implements DemoService {
    @Override
    public String hello(String name) {
        return getClass().getName() + ": " + name;
    }
}
