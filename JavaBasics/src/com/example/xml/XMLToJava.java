package com.example.xml;

import java.io.File;

public class XMLToJava {
	
	public static void main(String[] args) {
        // XML to Java Object
        try {
            File  xmlFile = new File("person.xml");
            JAXBContext context = JAXBContext.newInstance(Person.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Person person = (Person) unmarshaller.unmarshal(xmlFile);
            System.out.println("Unmarshalled object: " + person);

            // Java Object to XML
            File xmlOutput = new File("output.xml");
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // For pretty-printing XML
            marshaller.marshal(person, xmlOutput);
            System.out.println("Marshalled object to output.xml");

        } catch (JAXBException e) {
            e.printStackTrace();
        }

}
