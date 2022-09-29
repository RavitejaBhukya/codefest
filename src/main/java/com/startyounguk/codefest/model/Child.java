package com.startyounguk.codefest.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
@Entity
@Table(name = "SYUK_CHILD")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "CHILD_ID")
    private Long id;

    @Column(nullable = false, name = "CHILD_NAME")
    private String name;

    @Column(name = "CHILD_AGE")
    private Integer age;

    @Column(name = "CHILD_DOB")
    private Date dob;

    @Column(name = "CHILD_INTEREST1")
    private String interest1;

    @Column(name = "CHILD_INTEREST2")
    private String interest2;

    @Column(name = "CHILD_INTEREST3")
    private String interest3;

    @Column(name = "CHILD_NEED_IMPROVE1")
    private String improvement1;

    @Column(name = "CHILD_NEED_IMPROVE2")
    private String improvement2;

    @Column(name = "CHILD_NEED_IMPROVE3")
    private String improvement3;
}
