package io.sofastack.consumer.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import io.sofastack.facade.TestFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/8/26 11:35 AM
 * @since:
 **/
@RestController
public class TestController {

    @SofaReference(uniqueId = "glmapper",interfaceType = TestFacade.class,binding = @SofaReferenceBinding(bindingType = "bolt"))
    private TestFacade testFacade;

    @RequestMapping("test")
    public String test(){
        return testFacade.test();
    }
}
