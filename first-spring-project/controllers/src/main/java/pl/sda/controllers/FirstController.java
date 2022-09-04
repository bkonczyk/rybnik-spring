package pl.sda.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/first")
public class FirstController {

    @GetMapping
    public String firstGetMethod() {
        return "Hello Controller";
    }

    @GetMapping("/{id}")
    public String getWithPathVariable(@PathVariable(name = "id") String id) {
        return "Fetching element no: " + id;
    }

    @GetMapping("/index")
    public String getWithRequestParam(@RequestParam(name = "page") String page) {
        return "Getting page no: " + page;
    }

    @GetMapping("/index2")
    public String getWithMultipleRequestParams(@RequestParam(name = "page") String page,
                                               @RequestParam(name = "sort") String sort) {
        return "Getting page no: " + page + " sort by: " + sort;
    }
}
