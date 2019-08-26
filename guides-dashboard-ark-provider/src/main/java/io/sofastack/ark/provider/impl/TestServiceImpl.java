package io.sofastack.ark.provider.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import io.sofastack.facade.TestFacade;
import org.springframework.stereotype.Service;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/7/15 7:53 PM
 * @since:
 **/
@Service
@SofaService
public class TestServiceImpl implements TestFacade {

    @Override
    public String test() {
        return "this is test facade impl";
    }
}
