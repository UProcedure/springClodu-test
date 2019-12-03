package com.weimin.filter;

import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author weimin
 * @ClassName ZuulFilter
 * @Description TODO
 * @date 2019/12/3 11:49
 */
@Component
public class ZuulFilter extends com.netflix.zuul.ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getParameter("token");
        if(token==null || token.trim().isEmpty()){
            requestContext.setSendZuulResponse(false);
            try {
                requestContext.getResponse().getWriter().print("token is null!!!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
