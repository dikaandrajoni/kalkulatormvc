package com.kalkulator.kalkulatormvc.controller;

import com.kalkulator.kalkulatormvc.model.KalkulatorModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class KalkulatorController {
    KalkulatorModel mdl = new KalkulatorModel();

    @RequestMapping("/")
    public String kalkulator(Model model){
        model.addAttribute("mdl", mdl);
        return "index";
    }

    @RequestMapping(value = "/", params = "tambah", method = RequestMethod.POST)
    public String tambah(@ModelAttribute("mdl") KalkulatorModel mdl, Model model){
        model.addAttribute("hasil", mdl.getAngka1()+ mdl.getAngka2());
        return "index";

    }

    @RequestMapping(value = "/", params = "kurang", method = RequestMethod.POST)
    public String kurang(@ModelAttribute("mdl") KalkulatorModel mdl, Model model){
        model.addAttribute("hasil", mdl.getAngka1()-mdl.getAngka2());
        return "index";

    }

    @RequestMapping(value = "/", params = "kali", method = RequestMethod.POST)
    public String kali(@ModelAttribute("mdl") KalkulatorModel mdl, Model model){
        model.addAttribute("hasil", mdl.getAngka1()*mdl.getAngka2());
        return "index";

    }

    @RequestMapping(value = "/", params = "bagi", method = RequestMethod.POST)
    public String bagi(@ModelAttribute("mdl") KalkulatorModel mdl, Model model){
        model.addAttribute("hasil", mdl.getAngka1()/mdl.getAngka2());
        return "index";

    }

}
