package com.manawork.mana;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/company" )
public class CompanyController{

    @Autowired
    private CompanyMapper companyMapper;

    @PostMapping( "" )
    int post( @RequestBody Company company ){
        return companyMapper.insert( company );
    }

    @GetMapping("")
    public List< Company > getALL(){
        return companyMapper.getAll();
    }



}
