package io.sofastack.ark.master.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import io.sofastack.facade.TestFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.CompoundEnumeration;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/7/15 8:01 PM
 * @since:
 **/
@RestController
public class TestController {

    @SofaReference
    private TestFacade testFacade;

    @RequestMapping("/test")
    public String test(){
        return testFacade.test();
    }
}
