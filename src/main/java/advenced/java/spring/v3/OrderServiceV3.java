package advenced.java.spring.v3;

import advenced.java.spring.trace.TraceId;
import advenced.java.spring.trace.TraceStatus;
import advenced.java.spring.trace.logtrace.LogTrace;
import advenced.java.spring.trace.rawtrace.TraceV2;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV3 {

    private final OrderRepositoryV3 orderRepository;
    private final LogTrace trace;

    public void orderItem(String itemId) {

        TraceStatus status = null;

        try {
            status = trace.begin( "OrderService.orderItem()");
            orderRepository.save(itemId);
            trace.end(status);
        } catch (Exception e) {
            trace.exception(status, e);
            throw e;
        }

    }

}
