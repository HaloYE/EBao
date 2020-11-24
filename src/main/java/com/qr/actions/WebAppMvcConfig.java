package com.qr.actions;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAppMvcConfig implements WebMvcConfigurer {
    @Value("${file.path}")
    private String path;

    @Value("${file.static-path}")
    private String staticPath;

    // 如果访问http://localhost:8080/upload/image/test.jpg
    // 实则访问H:/Business/image/test.jpg

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println(staticPath);
        System.out.println("*******************");
        registry.addResourceHandler(staticPath).addResourceLocations("file:"+path);
    }
}