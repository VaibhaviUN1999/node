package com.springsec.springsec;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {




    List<Student> students=new ArrayList<>(List.of(
            new Student(10,"Vai",100),
            new Student(20,"san",77)
    ));

    @GetMapping("/students")
    public List<Student> getstudents(){
        return students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getcsrf(HttpServletRequest http)
    {
        return (CsrfToken) http.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student add(@RequestBody Student stud){
        students.add(stud);
        return  stud;
    }
}
