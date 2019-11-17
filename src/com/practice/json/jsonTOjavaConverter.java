package com.practice.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class jsonTOjavaConverter {
    public static void main(String[] args) throws IOException {
        String json = "{\n" +
                "  \"id\" : 1,\n" +
                "  \"name\" : \"suhas\",\n" +
                "  \"address\" : \"abc\",\n" +
                "  \"sal\" : 100\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();
        Employee emp = mapper.readValue(json, Employee.class);
        System.out.println(emp.toString());
    }
}
