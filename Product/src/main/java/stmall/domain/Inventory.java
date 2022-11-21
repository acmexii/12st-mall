package stmall.domain;

import stmall.domain.StockDecreased;
import stmall.domain.StockIncreased;
import stmall.ProductApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Inventory_table")
@Data

public class Inventory  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String productId;
    
    
    
    
    
    private String productName;
    
    
    
    
    
    private String productImage;
    
    
    
    
    
    private Integer stock;

    @PostUpdate
    public void onPostUpdate(){


        StockDecreased stockDecreased = new StockDecreased(this);
        stockDecreased.publishAfterCommit();

    }
    @PreUpdate
    public void onPreUpdate(){


        StockIncreased stockIncreased = new StockIncreased(this);
        stockIncreased.publishAfterCommit();

    }

    public static InventoryRepository repository(){
        InventoryRepository inventoryRepository = ProductApplication.applicationContext.getBean(InventoryRepository.class);
        return inventoryRepository;
    }




    public static void inventoryDecrease(DeliveryCompleted deliveryCompleted){

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);


         });
        */

        
    }
    public static void inventoryIncrease(ReturnCompleted returnCompleted){

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        */

        /** Example 2:  finding and process
        
        repository().findById(returnCompleted.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);


         });
        */

        
    }


}
