package com.crm.exception;

import com.crm.euums.ExceptionEnums;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CrmException extends RuntimeException{
    private ExceptionEnums exceptionEnums;










}
