package com.java.pojo;

import com.java.pojo.EarningsGr;
import com.java.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-27T23:46:25")
@StaticMetamodel(Earnings.class)
public class Earnings_ { 

    public static volatile SingularAttribute<Earnings, User> idUser;
    public static volatile SetAttribute<Earnings, EarningsGr> earningsGrSet;
    public static volatile SingularAttribute<Earnings, Long> currency;
    public static volatile SingularAttribute<Earnings, String> details;
    public static volatile SingularAttribute<Earnings, Integer> id;
    public static volatile SingularAttribute<Earnings, String> time;

}