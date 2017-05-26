package com.duchunxia.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.duchunxia.domain.Gongnv;
import com.mangofactory.swagger.annotations.ApiIgnore;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
@Controller
@ApiIgnore
public class SwaggerController {
    /*
     *  http://localhost:8080/swagger/index.html
     */
    @RequestMapping(value = "addGroup", method = RequestMethod.POST)
    @ApiOperation(notes = "addGroup", httpMethod = "POST", value = "添加一个新的群组")
    @ApiResponses(value = {@ApiResponse(code = 405, message = "invalid input")})
    public Gongnv addGroup(@ApiParam(required = true, value = "group data") @RequestBody Gongnv group) {
        return group;
    }
    /**
     *
     * @return
     */
    @ApiOperation(value="Get all gongnv",notes="requires noting")
    @RequestMapping(value = "getUsers", method = RequestMethod.POST)
    public List<Gongnv> getUsers(){
        List<Gongnv> list=new ArrayList<Gongnv>();
        Gongnv gongnv=new Gongnv();
        gongnv.setSname("hello");
        list.add(gongnv);
        Gongnv gongnv2=new Gongnv();
        gongnv2.setSname("world");
        list.add(gongnv2);
        return list;
    }

   @ApiOperation(value="Get gongnv with id",notes="requires the id of user")
    @RequestMapping(value="/{sname}",method=RequestMethod.GET)
    public Gongnv getGongnvById(@PathVariable String sname){
    	Gongnv gongnv=new Gongnv();
    	gongnv.setSname("hello world");
        return gongnv;
    }
}
