package com.javadream.MappedSuperClassJPAExample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user_detail")
public class User extends BaseEntity{

    private String name;
    private String emailId;
    private String mobileNumber;
}
