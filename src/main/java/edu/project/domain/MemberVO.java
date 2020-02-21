package edu.project.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "mbr_mst")
@NoArgsConstructor
@AllArgsConstructor
public class MemberVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id", nullable = false, unique = true, length = 50)
    private String userId;

    @Column(name = "user_passwd", nullable = false, length = 100)
    private String userPasswd;

    @Column(name = "user_email", nullable = false, unique = true, length = 50)
    private String userEmail;

    @Column(name = "user_first_name", nullable = false, length = 50)
    private String userFirstName;

    @Column(name = "user_last_name", nullable = false, length = 50)
    private String userLastName;

    @Column(name = "reg_id", length = 20)
    private String regId;

    @CreationTimestamp
    @Column(name = "reg_dt")
    private Date regDt;

    @Column(name = "upd_id",  length = 20)
    private String updId;

    @CreationTimestamp
    @Column(name = "upd_dt")
    private Date updDt;
}
