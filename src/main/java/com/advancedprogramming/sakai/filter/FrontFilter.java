package com.advancedprogramming.sakai.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;

import com.advancedprogramming.sakai.config.SakaiConstant;

@Component
public class FrontFilter implements Filter {
	
	@Value("#{'${sakai.whitelist}'.split(',')}")
	private List<String> whiteList;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try {
			HttpServletRequest httpServletRequest = (HttpServletRequest) request;
			HttpSession session = httpServletRequest.getSession();
			
			if (whiteList.contains(((HttpServletRequest) request).getRequestURI()) || session.getAttribute(SakaiConstant.CURRENT_USER) != null) {
				chain.doFilter(request, response);
			} else {
				((HttpServletResponse) response).sendRedirect("/login");
			}			
		} catch (Exception ex) {
			((HttpServletResponse) response).sendRedirect("/login");
		}
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
