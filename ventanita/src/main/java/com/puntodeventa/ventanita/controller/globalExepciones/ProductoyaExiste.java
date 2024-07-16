package com.puntodeventa.ventanita.controller.globalExepciones;

public class ProductoyaExiste extends RuntimeException{
    private String id;
    private String resurceName;
    private Object fieldvalue;

    public ProductoyaExiste(String id, String resurceName, Object fieldvalue) {
        super(String.format("%s no fue encontrado con:%s = '%s'",  resurceName, id, fieldvalue));
        this.id = id;
        this.resurceName = resurceName;
        this.fieldvalue = fieldvalue;
    }
    

}
