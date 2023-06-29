package com.example.talkerManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TalkerManagerApplication {
    public static void main(String[] args) {
      SpringApplication.run(TalkerManagerApplication.class, args);
    }
    
    @GetMapping("/talker")
     public String getTalker(@RequestParam(value = "name", defaultValue = "Get - Talker") String name) {
      return String.format("Hello, %s!", name);
    }

    @GetMapping("/talker/search")
    public String getTalkerSearch(@RequestParam(value = "name", defaultValue = "Get - Search Talker") String name) {
      return String.format("Hello, %s!", name);
    }

    @GetMapping("/talker/{id}")
    @ResponseBody
    public String getTalkerId(@PathVariable(required = false) String id) {

      if (id != null) {
        return "ID: " + id;
      } 
      return "ID Not Found";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam(value = "name", defaultValue = "Post - Login") String name) {
      return String.format("Hello, %s!", name);
    }

    @PostMapping("/talker")
    String postTalker(@RequestBody TalkerControllerDetails ob) {
       
    TalkerControllerDetails.Data.add(new TalkerControllerDetails(ob.number, ob.name));
    for (TalkerControllerDetails tcd : TalkerControllerDetails.Data) {
      System.out.println(tcd.number);
      System.out.println(tcd.name);
    }
      return "Talker Added";
    }

    @PutMapping("/talker/:id")
    public String putTalker(@RequestParam(value = "name", defaultValue = "Put - Talker By Id") String name) {
      return String.format("Hello %s!", name);
    }
    
    @DeleteMapping("/talker/:id")
    public String deleteTalker(@RequestParam(value = "name", defaultValue = "Delete - Talker By Id") String name) {
      return String.format("Hello %s!", name);
    }


}