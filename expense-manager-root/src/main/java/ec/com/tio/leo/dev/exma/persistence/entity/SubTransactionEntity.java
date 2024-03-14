package ec.com.tio.leo.dev.exma.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class SubTransactionEntity {
    private Long idSubTransaction;
    private Long idTransaction;
    private String description;
    private Date date;
    private Double amount;
}
