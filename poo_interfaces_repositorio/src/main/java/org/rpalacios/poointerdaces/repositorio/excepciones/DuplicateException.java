package org.rpalacios.poointerdaces.repositorio.excepciones;

public class DuplicateException extends DataWriteAccessException {
    public DuplicateException(String message) {
        super(message);
    }
}
