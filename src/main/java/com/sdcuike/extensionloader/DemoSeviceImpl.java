package com.sdcuike.extensionloader;

import com.alipay.sofa.rpc.ext.Extension;

/**
 * 注解上的扩展点名字是必须配置的，所有配置文件中的扩展点名字可以不配置了，如果配置，必须相同哦
 *
 * @author sdcuike
 * @date 2018/5/12
 */
@Extension("demoSeviceImpl")
public class DemoSeviceImpl implements DemoService {
    @Override
    public String hello(String name) {
        return getClass().getName() + ": " + name;
    }
}
