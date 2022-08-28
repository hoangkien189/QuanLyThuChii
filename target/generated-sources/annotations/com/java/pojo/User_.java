package com.java.pojo;

import com.java.pojo.Earnings;
import com.java.pojo.Expenditures;
import com.java.pojo.MemberGr;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-27T23:46:25")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> role;
    public static volatile SetAttribute<User, Earnings> earningsSet;
    public static volatile SetAttribute<User, MemberGr> memberGrSet;
    public static volatile SingularAttribute<User, String> phonenumber;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SetAttribute<User, Expenditures> expendituresSet;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> avt;
    public static volatile SingularAttribute<User, String> username;

}