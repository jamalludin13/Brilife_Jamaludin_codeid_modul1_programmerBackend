package controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.list_propinsiService;

@Controller
public class list_propinsiController {
		

    @Autowired
    private list_propinsiService service;
    
    
    @RequestMapping("/home")
    public String viewHomePage(Model model) {
        List<list_propinsi> listlist_propinsi = service.listAll();
        model.addAttribute("listlist_propinsi", listlist_propinsi);
         
        return "index";
    }
    
    @RequestMapping("/new")
    public String showNewPropinsiPage(Model model) {
        list_propinsi List_Propinsi = new list_propinsi();
        model.addAttribute("List_Propinsi", List_Propinsi);
         
        return "new_list_propinsi";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savelist_propinsi(@ModelAttribute("List_Propinsi") list_propinsi List_Propinsi) {
        service.save(List_Propinsi);
         
        return "redirect:/";
    } 
    
    @RequestMapping("/edit/{id_propinsi}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id_propinsi") int id_propinsi) {
        ModelAndView mav = new ModelAndView("edit_list_propinsi");
        list_propinsi List_Propinsi = service.get(id_propinsi);
        mav.addObject("List_Propinsi", List_Propinsi);
         
        return mav;
    }
    @RequestMapping("/delete/{id_propinsi}")
    public String deletePropinsi(@PathVariable(name = "id_propinsi") int id_propinsi) {
        service.delete(id_propinsi);
        return "redirect:/";       
    }
 
}
