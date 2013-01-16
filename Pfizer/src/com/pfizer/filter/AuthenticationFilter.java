package com.pfizer.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pfizer.bean.UserBean;

public class AuthenticationFilter implements Filter {
	  private FilterConfig config;

	  public void doFilter(ServletRequest req, ServletResponse resp,
	      FilterChain chain) throws IOException, ServletException {
		  System.out.println("I am filter");
	    if (((HttpServletRequest) req).getSession().getAttribute(
	        "user_name") == null) {
	    	System.out.println("not pass to the filter chain");
	      ((HttpServletResponse) resp).sendRedirect(((HttpServletRequest)req).getContextPath()+"/login/login.xhtml");
	    } else {
	    System.out.println("pass to the filter chain");
	      chain.doFilter(req, resp);
	    }
	  }

	  public void init(FilterConfig config) throws ServletException {
	    this.config = config;
	  }

	  public void destroy() {
	    config = null;
	  }
	}