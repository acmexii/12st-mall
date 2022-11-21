package stmall.domain;

import stmall.domain.*;
import stmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String customerId;
    private String customerName;
    private String productId;
    private String productName;
    private Integer qty;

    public OrderCanceled(Order aggregate){
        super(aggregate);
    }
    public OrderCanceled(){
        super();
    }
}
