package ec.com.tio.leo.dev.exma.persistence.entity;

import ec.com.tio.leo.dev.exma.commons.EXMAConstants;
import ec.com.tio.leo.dev.exma.enums.TypeTransactionEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "TRANSACTION")
public class TransactionEntity extends AbstractAuditableField<UserEntity, Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDTRANSACTION", nullable = false)
    private Long idTransaction;

    @Column(name = "IDACCOUNT", nullable = false)
    private Long idAccount;

    @Column(name = "IDCATEGORY", nullable = false)
    private Long idCategory;

    @Column(name = "TYPE", nullable = false, length = 30)
    @Enumerated(EnumType.STRING)
    private TypeTransactionEnum type;

    @Column(name = "DESCRIPTION", length = 200)
    private String description;

    @Column(name = "DATE", nullable = false)
    private LocalDateTime date;

    @Column(name = "AMOUNT", nullable = false, columnDefinition = "DECIMAL(19,2)")
    private Double amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDCATEGORY", referencedColumnName = "IDCATEGORY", insertable = false, updatable = false)
    private CategoryEntity categoryEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDACCOUNT", referencedColumnName = "IDACCOUNT", insertable = false, updatable = false)
    private AccountEntity accountEntity;

    @Override
    public Long getId() {
        return this.idTransaction;
    }
}
