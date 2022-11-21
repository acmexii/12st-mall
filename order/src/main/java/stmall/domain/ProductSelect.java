package stmall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="ProductSelect_table")
@Data
public class ProductSelect {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}