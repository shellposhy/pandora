package com.pandora.portal.consumer.framework.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 拦截用户初次请求，检查用户请求，以及非法请求等
 * 
 * @author shishb
 * @version 1.0
 */
public class BaseFilter implements Filter {

	// 过滤器属性
	FilterConfig filterConfig;

	// 过滤器
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// HttpServletRequest servletRequest = (HttpServletRequest) request;
		chain.doFilter(request, response);
	}

	// 初始化
	public void init(FilterConfig config) throws ServletException {
		this.filterConfig = config;
	}

	// 销毁
	public void destroy() {
		this.filterConfig = null;
	}

}
