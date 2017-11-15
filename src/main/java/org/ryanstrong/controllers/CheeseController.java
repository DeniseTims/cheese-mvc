package org.ryanstrong.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;


/**
 * Created by ryanstrong on 3/9/17.
 */
@Controller
@RequestMapping ("cheese")
public class CheeseController {

    static HashMap<String, String> cheeses = new HashMap<>();

   // ArrayList<String > cheeses = new ArrayList<>();
    //Request path: GET/cheese
    @RequestMapping(value = "")//, method = RequestMethod.GET)

    public String index(Model model) {
        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "My Cheeses");
        return "cheese/index";//my Cheese

    }
//request path: Get/cheese/add
    @RequestMapping(value ="add", method = RequestMethod.GET)
            public String displayAddCheeseForm(Model model){
        model.addAttribute("title", "Add Cheese" );
        return "cheese/add";
        }
        //request path: Post /cheese/add
        @RequestMapping(value= "add", method = RequestMethod.POST)
        public String processAddCheeseForm(@RequestParam String cheeseName, @RequestParam String description) {
            cheeses.put(cheeseName, description);
            // Redirect to /cheese
            return "redirect:";
        }
           // public String displayDeleteForm(Model model){
             //   model.addAttribute

    @RequestMapping(value="remove", method=RequestMethod.GET)
    public String displayRemoveUserForm(Model model
//            , @RequestParam String cheeseName, @RequestParam String description
    ){
        model.addAttribute("cheeseName",cheeses);
//        model.addAttribute("description", cheeses.get(description);
        return  "cheese/remove";
    }
    @RequestMapping(value="remove", method = RequestMethod.POST)
    public String processRemoveUserForm(@RequestParam String cheeseName,
                                        @RequestParam String description){
        {
            cheeses.remove(cheeseName, description );
        }
        return "redirect:";
    }
    }


