package com.hinckley.sailor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.hinckley.sailor.api" })
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/about.htm").setViewName("about");
		registry.addViewController("/team.htm").setViewName("team");
		registry.addViewController("/testimonials.htm").setViewName("testimonials");
		registry.addViewController("/services.htm").setViewName("services");
		registry.addViewController("/portfolio.htm").setViewName("portfolio");
		registry.addViewController("/pricing.htm").setViewName("pricing");
		registry.addViewController("/blog.htm").setViewName("blog");
		registry.addViewController("/contact.htm").setViewName("contact");
		registry.addViewController("/index.htm").setViewName("index");
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/jsp/", ".html");
	}

}
