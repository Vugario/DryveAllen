/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itopia.dryves.config;

import com.itopia.dryves.social.config.SocialConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@PropertySource("classpath:config.properties")
@Import({DataConfig.class, SocialConfig.class})
public class ApplicationConfig extends WebMvcConfigurerAdapter {
	
	
	
}
