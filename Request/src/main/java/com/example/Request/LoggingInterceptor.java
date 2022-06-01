package com.example.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import ch.qos.logback.classic.Logger;



public class LoggingInterceptor implements HandlerInterceptor {
	
   Logger logger = (Logger) LoggerFactory.getLogger(LoggingInterceptor.class);

	public  boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
//   Map<String,Object> inputMap = new ObjectMapper().readValue(request.getInputStream(),Map.class)
//		logger.info("Incoming request is " + inputMap);
//		logger.info("Incoming url is: "+ request.getRequestURL());
		return true;
	}
	
//	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,@Nullable ModelAndView modelAndView) throws Exception{
//		
//	}
//
//	
//	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,@Nullable Exception ex) throws Exception {
//		
//	}

	
	
	
	
}
