package org.ryanstrong.controllers;

//import models.Cheese;

import org.ryanstrong.models.Cheese;
import org.ryanstrong.models.data.CheeseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

// import org.mockMVC
/**
 * Created by ryanstrong on 3/9/17.
 */
@Controller
@RequestMapping ("cheese")
public class CheeseController {

    @Autowired
    private CheeseDao cheeseDao;

//    static HashMap<String, String> cheeses = new HashMap<>();
//    private List<Cheese> cheeses = new ArrayList<>();
   // ArrayList<String > cheeses = new ArrayList<>();
    //Request path: GET/cheese
    @RequestMapping(value = "")//, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("cheeses", cheeseDao.findAll());
        model.addAttribute("title", "My Cheeses");
        return "cheese/index";//my Cheese
    }
//request path: Get/cheese/add
    @RequestMapping(value ="add", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model){
        model.addAttribute("title", "Add Cheese" );
        model.addAttribute(new Cheese());
        return "cheese/add";
        }
        //request path: Post /cheese/add
        @RequestMapping(value= "add", method = RequestMethod.POST)
        public String processAddCheeseForm(Model model,
                @ModelAttribute Cheese newCheese, Errors errors)
//                @RequestParam String name
// , @RequestParam String description)
        {if(errors.hasErrors()){
            model.addAttribute("title", "New Report");
            return "cheese/add/";
        }
//            cheeses.put(name, description);
//            String cheeseList = Cheese.getName();
//            cheeses. add(newCheese);
//            cheeses.set(cheeses.getName, description);
            cheeseDao.save(newCheese);
            // Redirect to /cheese
            return "redirect:";
        }
           // public String displayDeleteForm(Model model){
             //   model.addAttribute
    @RequestMapping(value="edit", method=RequestMethod.GET)
    public String displayEditForm(Model model, @PathVariable int id)
    {
        model.addAttribute("cheeseName", cheeseDao.findAll());
        return "cheese/edit";
    }
    @RequestMapping(value="edit", method = RequestMethod.POST)
    public String processEditForm(@PathVariable int id, String name,
                                  String description){
                return "cheese/edit";
    }
    @RequestMapping(value="remove", method=RequestMethod.GET)
    public String displayRemoveUserForm(Model model, @RequestParam int id
//            , @RequestParam String cheeseName, @RequestParam String description
    ){
//        Cheese cheese = cheeseDao.findAll();
        model.addAttribute("cheeseName",cheeseDao.findAll());
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


