package com.manawork.mana;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CompanyMapper{

    @Insert( "INSERT INTO company(company_name, company_address) VALUES(#{company.name}, #{company.address})" )
    int insert( @Param( "company" ) Company company );


    @Select( "SELECT * FROM company" )
    @Results( { @Result( property = "name", column = "company_name" )
            , @Result( property = "address", column = "company_add" ) } )
    List< Company > getAll();

    @Select( "SELECT * FROM company WHERE id=#{id}" )
    Company getById( @Param( "id" ) int id );
}
