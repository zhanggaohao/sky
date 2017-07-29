package org.sky.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseController<T> {

    protected Logger getLogger(Class<T> cz) {
        return LoggerFactory.getLogger(cz.getClass());
    }

}
