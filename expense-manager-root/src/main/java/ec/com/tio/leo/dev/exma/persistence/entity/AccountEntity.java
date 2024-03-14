package ec.com.tio.leo.dev.exma.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
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

@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "ACCOUNT")
public class AccountEntity extends AbstractAuditableField<UserEntity, Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDACCOUNT", nullable = false)
    private Long accountId;

    @Column(name = "HOLDER", nullable = false, length = 100)
    private String holder;

    @Column(name = "CURRENCY", nullable = false, length = 3)
    private String currency;

    @Column(name = "NUMBERACCOUNT", nullable = false)
    private String numberAccount;

    @Column(name = "DESCRIPTION", length = 230)
    private String description;

    @Column(name = "CURRENTBALANCE", columnDefinition = "DECIMAL(19,2)")
    private Double currentBalance;

    @Column(name = "IDUSER")
    private Long idUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IDUSER", referencedColumnName = "IDUSER", insertable = false, updatable = false)
    private UserEntity userEntity;

    @Override
    public Long getId() {
        return accountId;
    }
}
