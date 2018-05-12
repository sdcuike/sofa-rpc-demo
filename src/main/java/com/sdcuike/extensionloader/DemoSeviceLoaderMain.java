package com.sdcuike.extensionloader;

import com.alipay.sofa.rpc.ext.ExtensionLoader;
import com.alipay.sofa.rpc.ext.ExtensionLoaderFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sdcuike
 * @date 2018/5/12
 */
@Slf4j
public class DemoSeviceLoaderMain {
    public static void main(String[] args) {

        ExtensionLoader<DemoService> demoSeviceExtensionLoader = ExtensionLoaderFactory.getExtensionLoader(DemoService.class, t -> {

            System.out.println(" ExtensionLoader :" + t);

        });


        System.out.println(demoSeviceExtensionLoader.getAllExtensions());
        System.out.println(demoSeviceExtensionLoader.getExtension("demoSeviceImpl"));
    }
}
