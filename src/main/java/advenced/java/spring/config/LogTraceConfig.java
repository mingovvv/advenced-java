package advenced.java.spring.config;

import advenced.java.spring.trace.v3_logtrace.LogTrace;
import advenced.java.spring.trace.v3_logtrace.ThreadLocalLogTrace;
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
