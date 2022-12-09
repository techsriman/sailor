package com.hinckley.sailor.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.hinckley.sailor.config.WebMvcConfig;

public class SailorWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebMvcConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"*.htm" };
	}

}
