package com.crm.service;

import com.crm.bean.Role;
import com.crm.euums.ExceptionEnums;
import com.crm.exception.CrmException;
import com.crm.mapper.RoleMapper;
import com.netflix.discovery.converters.jackson.EurekaXmlJacksonCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public Role findById(Long id){
        if(id == null) {
            throw  new CrmException(ExceptionEnums.PARAM_IS_NULL);
        }
      return roleMapper.selectByPrimaryKey(id);
    }
}
