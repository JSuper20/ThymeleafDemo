package com.offcn.controller;

import com.offcn.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class HelloThymeleaf {

    @GetMapping("/first")
    public String helloPage(Model model){
        model.addAttribute("msg", "今天天气好，真滴好");
        return "hello";
    }

    @GetMapping("/second")
    public String person(Model model){
        Person person = new Person(1000, "张三", 18);
        model.addAttribute("person", person);

        Map<String, String> map = new HashMap<>();
        map.put("country", "China");
        map.put("capital", "Beijing");
        model.addAttribute("map", map);

        return "person";
    }

    @GetMapping("/third")
    public String list(Model model){
        List<Person> list = new ArrayList<>();
        list.add(new Person(100, "张三", 18));
        list.add(new Person(200, "李四", 28));
        list.add(new Person(300, "王五", 38));
        list.add(new Person(400, "赵六", 48));
        model.addAttribute("list", list);
        return "personList";
    }

    @GetMapping("/forth")
    public String name(Model model){
        model.addAttribute("name", "张三");
        return "name";
    }


    @GetMapping("/fifth")
    public String choice(Model model){
        model.addAttribute("flag", "N");
        return "choice";
    }


    @GetMapping("/sixth")
    public String showSwitch(Model model){
        model.addAttribute("auth", "root");
        model.addAttribute("root", "super");
        model.addAttribute("manager", "user");
        return "switch";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/look")
    public String look(){
        return "body";
    }

    @GetMapping("/showInnerObj")
    public String showInnerObj(Model model){
        model.addAttribute("date", new Date());
        model.addAttribute("num", 999.869D);
        model.addAttribute("str", "包含FreeMarker,Groovy,Thymeleaf,Velocity和Mustache,SpringBoot中推荐使用Thymeleaf作为模板引擎.因为Thymeleaf提供了完美的SpringMVC支持.\n" +
                "Thymeleaf是一个Java类库，他是一个xml/xhtml/html5的模板引擎，可以作为mvc的web应用的view层。");
        return "showInnerObj";

    }

}
