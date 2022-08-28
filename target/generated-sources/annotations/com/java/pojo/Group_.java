package com.java.pojo;

import com.java.pojo.EarningsGr;
import com.java.pojo.ExpendituresGr;
import com.java.pojo.MemberGr;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-27T23:46:25")
@StaticMetamodel(Group.class)
public class Group_ { 

    public static volatile SingularAttribute<Group, String> role;
    public static volatile SetAttribute<Group, ExpendituresGr> expendituresGrSet;
    public static volatile SetAttribute<Group, MemberGr> memberGrSet;
    public static volatile SingularAttribute<Group, String> name;
    public static volatile SetAttribute<Group, EarningsGr> earningsGrSet;
    public static volatile SingularAttribute<Group, Integer> id;

}