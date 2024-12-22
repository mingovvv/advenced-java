package advenced.java.spring.config;

import advenced.java.spring.trace.logtrace.FieldLogTrace;
import advenced.java.spring.trace.logtrace.LogTrace;
import advenced.java.spring.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
//        return new FieldLogTrace();
        return new ThreadLocalLogTrace();
    }

}
