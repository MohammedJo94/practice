package org.asif.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ThyemeLeafWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses(){
		return new Class<?>[]{RootConfig.class};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses(){
		return new Class<?>[] {WebMvcConfig.class};
	}
	
	@Override
	protected String[] getServletMappings(){
		return new String[]{"/"};
	}
	
}
