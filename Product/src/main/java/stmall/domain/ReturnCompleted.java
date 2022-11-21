package stmall.domain;

import stmall.domain.*;
import stmall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class ReturnCompleted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;
    private String customerId;
    private String address;
    private String status;
}


