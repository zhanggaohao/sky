package com.sky.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @annotation TODO
 * @version 1.0
 * @author zhanggaohao
 * @date 2017年7月15日 下午9:17:20
 *
 */
public class SkyFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
        
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        chain.doFilter(request, response);
    }

    public void destroy() {
        // TODO Auto-generated method stub
        
    }

}
