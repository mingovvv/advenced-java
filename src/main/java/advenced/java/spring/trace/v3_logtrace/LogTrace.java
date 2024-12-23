package advenced.java.spring.trace.v3_logtrace;

import advenced.java.spring.trace.TraceStatus;

public interface LogTrace {

    TraceStatus begin(String message);

    void end(TraceStatus status);

    void exception(TraceStatus status, Exception e);

}
