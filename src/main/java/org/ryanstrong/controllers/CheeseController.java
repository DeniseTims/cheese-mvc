package org.ryanstrong.controllers;

import models.Cheese;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

// import org.mockMVC


/**
 * Created by ryanstrong on 3/9/17.
 */
@Controller
@RequestMapping ("cheese")
public class CheeseController {

//    static HashMap<String, String> cheeses = new HashMap<>();
    private List<Cheese> cheeses = new ArrayList<>();
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
        public String processAddCheeseForm(@ModelAttribute Cheese newCheese
        )
//                @RequestParam Cheese name, @RequestParam Cheese description)
        {
//            cheeses.put(cheeseName, description);
//            String cheeseList = Cheese.getName();
            cheeses.add(newCheese);
//            cheeses.set(cheeses.getName, description);
            // Redirect to /cheese
            return "redirect:";
        }
           // public String displayDeleteForm(Model model){
             //   model.addAttribute
    @RequestMapping(value="edit", method=RequestMethod.GET)
    public String displayEditForm(Model model, @PathVariable int cheeseId)
    {
        model.addAttribute("cheeseName", cheeses);
        return "cheese/edit";
    }
    @RequestMapping(value="edit", method = RequestMethod.POST)
    public String processEditForm(@PathVariable int cheeseId, String name,
                                  String description){
                return "cheese/edit";
    }
    @RequestMapping(value="remove", method=RequestMethod.GET)
    public String displayRemoveUserForm(Model model
//            , @RequestParam String cheeseName, @RequestParam String description
    ){
        model.addAttribute("cheeseName",cheeses);
//        model.addAttribute("description", cheeses.get(description);
        return  "cheese/remove";
    }
    @RequestMapping(value="remove", method = RequestMethod.POST)
    public String processRemoveUserForm(
//            @RequestParam Cheese getName,
                                        @ModelAttribute Cheese getName
//                                        @RequestParam Cheese description
    ){
//        {
//            getName.delete(cheese);
//        }
        return "redirect:";
    }
    }


