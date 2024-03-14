package ec.com.tio.leo.dev.exma.persistence.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@MappedSuperclass
public abstract class AbstractAuditableField<U, PK extends Serializable> implements Serializable {


    @Serial
    private static final long serialVersionUID = -5685582838401947071L;

    @Column(name = "STATUS", length = 1)
    protected @NotNull Boolean status;

    @Column(name = "CREATEDDATE")
    @CreatedDate
    protected @NotNull LocalDateTime createdDate;

    @Column(name = "LASTMODIFIEDDATE")
    @LastModifiedDate
    protected LocalDateTime lastModifiedDate;

    @Column(name = "CREATEDBYID")
    protected @NotNull PK createdById;

    @Column(name = "LASTMODIFIEDBYID")
    protected PK lastModifiedById;

    @Version
    @Column(name = "VERSION")
    protected @NotNull Integer version;

    @Column(name = "CREATEDHOSTIP", length = 50)
    protected String ipHostCreated;

    @Column(name = "MODIFIEDHOSTIP", length = 50)
    protected String ipHostModified;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CREATEDBYID", insertable = false, updatable = false)
    @JsonIgnore
    protected U createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LASTMODIFIEDBYID", insertable = false, updatable = false)
    @JsonIgnore
    protected U lastModifiedBy;


    public abstract PK getId();
}
