package stmall.domain;

import stmall.domain.*;
import stmall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String customerId;
    private String customerName;
    private String productId;
    private String productName;
    private Integer qty;
}


