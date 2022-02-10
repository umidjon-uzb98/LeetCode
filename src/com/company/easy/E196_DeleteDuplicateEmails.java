package com.company.easy;

public class E196_DeleteDuplicateEmails {

//      Write your MySQL query statement below

//    WITH CTE AS
//            (select min(id) as mn, email from Person group by email)
//
//    delete from Person
//    where id not in (select mn from CTE)

//    delete from person where id not in (
//    select min_ids from (
//    select min(id) as min_ids from person group by email
//    ) as sub
//    );
}

