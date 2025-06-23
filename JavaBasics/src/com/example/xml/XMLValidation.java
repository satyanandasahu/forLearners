package com.example.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XMLValidation {

    public static void main(String[] args) {
        
      System.out.println("person.xml validates against person.xsd? "+validateXMLSchema("person.xsd", "person.xml"));
      XMLValidation xmlValidation = new XMLValidation();
      System.out.println(xmlValidation.getFile("person.xsd").getAbsolutePath());
      }
    
    public static boolean validateXMLSchema(String xsdPath, String xmlPath){
        
        try {
            SchemaFactory factory = 
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | SAXException e) {
            System.out.println("Exception: "+e.getMessage());
            return false;
        }
        return true;
    }
    
    private File getFile(String location) {
        return new File(getClass().getClassLoader().getResource(location).getFile());
    }
}


