package br.ufpb.springboot2essencials.exceptions;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ValidationExceptionDetails  extends ExceptionDetails{
    private final String fields;
    private final String fieldsMessage;
}
