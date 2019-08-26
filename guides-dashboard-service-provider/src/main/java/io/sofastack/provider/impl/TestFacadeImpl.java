package io.sofastack.provider.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import io.sofastack.facade.TestFacade;
import org.springframework.stereotype.Service;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/8/26 11:34 AM
 * @since:
 **/
@Service
@SofaService(interfaceType = TestFacade.class, uniqueId = "glmapper", bindings = { @SofaServiceBinding(bindingType = "bolt") })
public class TestFacadeImpl implements TestFacade {
    @Override
    public String test() {
        return "hello glmapper";
    }
}
