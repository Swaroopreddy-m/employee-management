package com.third.springboot.employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_id_mapping")
public class UserIdMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Assuming no PK in table, we can use auto-generated
    private Long id;

    @Column(name = "SYSTEM_USER_ID", length = 100)
    private String systemUserId;

    @Column(name = "LOGIN_USER_ID", length = 100)
    private String loginUserId;

    @Column(name = "CREATED_BY", length = 100)
    private String createdBy;

    @Column(name = "CREATED_TIME", length = 100)
    private String createdTime;

    @Column(name = "APPROVED_BY", length = 100)
    private String approvedBy;

    @Column(name = "APPROVED_TIME", length = 100)
    private String approvedTime;

    @Column(name = "IP", length = 100)
    private String ip;

    @Column(name = "OTHERS", length = 100)
    private String others;

    // Optional: mapping to UserMaster
    @ManyToOne
    @JoinColumn(name = "SYSTEM_USER_ID", referencedColumnName = "SYSTEM_USER_ID", insertable = false, updatable = false)
    private UserMaster userMaster;

    // ✅ Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSystemUserId() { return systemUserId; }
    public void setSystemUserId(String systemUserId) { this.systemUserId = systemUserId; }

    public String getLoginUserId() { return loginUserId; }
    public void setLoginUserId(String loginUserId) { this.loginUserId = loginUserId; }

    public String getCreatedBy() { return createdBy; }
    public void setCreatedBy(String createdBy) { this.createdBy = createdBy; }

    public String getCreatedTime() { return createdTime; }
    public void setCreatedTime(String createdTime) { this.createdTime = createdTime; }

    public String getApprovedBy() { return approvedBy; }
    public void setApprovedBy(String approvedBy) { this.approvedBy = approvedBy; }

    public String getApprovedTime() { return approvedTime; }
    public void setApprovedTime(String approvedTime) { this.approvedTime = approvedTime; }

    public String getIp() { return ip; }
    public void setIp(String ip) { this.ip = ip; }

    public String getOthers() { return others; }
    public void setOthers(String others) { this.others = others; }

    public UserMaster getUserMaster() { return userMaster; }
    public void setUserMaster(UserMaster userMaster) { this.userMaster = userMaster; }
}