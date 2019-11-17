package com.practice.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConverterExample {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setAddress("abc");
        emp.setId(1);
        emp.setName("suhas");
        emp.setSal(100);
        ObjectMapper mapper = new ObjectMapper();

        try {
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
