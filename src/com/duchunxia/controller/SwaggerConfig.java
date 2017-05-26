package com.duchunxia.controller;

import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.models.dto.ApiInfo;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;

@Configuration
@EnableSwagger
public class SwaggerConfig{
	private SpringSwaggerConfig springSwaggerConfig;
	public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig) {
		this.springSwaggerConfig = springSwaggerConfig;
	}

	public SwaggerSpringMvcPlugin customImplementation() {
		/*return new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(
				apiInfo()).includePatterns(".*?");*/
        return  new SwaggerSpringMvcPlugin(this.springSwaggerConfig)
                .apiInfo(new ApiInfo("SpringMVC+MyBatis api", "我的第一个SwaggerSpringMvc", null, null, null, null))
                .useDefaultResponseMessages(false)
                .includePatterns(".*?");
   
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("My Apps API Title",
				"My Apps API Description", "My Apps API terms of service",
				"My Apps API Contact Email", "My Apps API Licence Type",
				"My Apps API License URL");
		return apiInfo;
	}
}
