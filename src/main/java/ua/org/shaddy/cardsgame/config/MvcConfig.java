package ua.org.shaddy.cardsgame.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import ua.org.shaddy.cardsgame.util.MappingExceptionResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "ua.org.shaddy.cardsgame" })
//@Import(DataSourceConfig.class)
public class MvcConfig extends WebMvcConfigurerAdapter{
	 	@Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        //registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	        registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/img/").setCachePeriod(90);
	        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/").setCachePeriod(0);
	        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/js/").setCachePeriod(0);
	        //registry.addResourceHandler("/components/**").addResourceLocations("/WEB-INF/js/components/");
	        //registry.addResourceHandler("/bower_components/**").addResourceLocations("/WEB-INF/bower_components/");
	    }
	 	
	    @Override
	    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	        configurer.enable();
	    }
	    
	    @Bean
	    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
	       return new PropertySourcesPlaceholderConfigurer();
	    }
	    
	    @Bean static ThreadPoolTaskScheduler lowPriorityTaskScheduler(){
	    	ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler ();
	    	scheduler.setPoolSize(10);
	    	return scheduler;
	    }
	    
	    @Bean
	    public InternalResourceViewResolver jspViewResolver() {
	        InternalResourceViewResolver bean = new InternalResourceViewResolver();
	        bean.setPrefix("/WEB-INF/views/");
	        bean.setSuffix(".jsp");
	        return bean;
	    }
	    	    
	    @Bean
	    public HandlerExceptionResolver createSimpleMappingExceptionResolver() {
	      MappingExceptionResolver resolver = new MappingExceptionResolver();
	      return resolver;
	   }
}
