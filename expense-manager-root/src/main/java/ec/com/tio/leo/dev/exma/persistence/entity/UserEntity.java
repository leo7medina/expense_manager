package ec.com.tio.leo.dev.exma.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EXMAUSER")
public class UserEntity implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDUSER", nullable = false)
    private Long userId;

    @Column(name = "USERNAME", nullable = false, unique = true, length = 30)
    private String username;

    @Column(name = "PASSWORD", nullable = false, length = 30)
    private String password;

    @Column(name = "EMAIL", length = 40)
    private String email;

    @Column(name = "FIRSTNAME", length = 60)
    private String firstName;

    @Column(name = "LASTNAME", length = 60)
    private String lastName;

    @Column(name = "IMAGEPROFILE")
    private String imgProfile;

    @Column(name = "STATUS", length = 1, columnDefinition = "VARCHAR(1)")
    private Boolean status;

}
