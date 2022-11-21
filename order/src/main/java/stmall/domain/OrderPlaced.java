package stmall.domain;

import stmall.domain.*;
import stmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String orderId;
    private String customerId;
    private String customerName;
    private String productId;
    private String productName;
    private Integer qty;
    private String address;

    public OrderPlaced(Order aggregate){
        super(aggregate);
    }
    public OrderPlaced(){
        super();
    }
}
