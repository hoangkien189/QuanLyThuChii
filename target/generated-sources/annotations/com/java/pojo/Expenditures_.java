package com.java.pojo;

import com.java.pojo.ExpendituresGr;
import com.java.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2022-08-27T23:46:25")
@StaticMetamodel(Expenditures.class)
public class Expenditures_ { 

    public static volatile SingularAttribute<Expenditures, User> idUser;
    public static volatile SetAttribute<Expenditures, ExpendituresGr> expendituresGrSet;
    public static volatile SingularAttribute<Expenditures, Long> currency;
    public static volatile SingularAttribute<Expenditures, String> details;
    public static volatile SingularAttribute<Expenditures, Integer> id;
    public static volatile SingularAttribute<Expenditures, Date> time;

}