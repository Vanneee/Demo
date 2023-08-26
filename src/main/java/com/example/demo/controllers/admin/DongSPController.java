package com.example.demo.controllers.admin;

import com.example.demo.controllers.entities.DongSP;
import com.example.demo.repositoris.DongSPrepository;
import com.example.demo.view_model.QLDongSP;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("admin/dongsp")
public class DongSPController {
    @Autowired
    private QLDongSP vm;

    @Autowired
    private DongSPrepository dsprepo;

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("ds",dsprepo.findAll());
        return "admin/dong_sp/index";

    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id")DongSP dongSP)
    {
        this.dsprepo.delete(dongSP);
        return "redirect:/admin/dongsp/index";
    }
    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("dsp",vm);
        model.addAttribute("action", "/admin/dongsp/store");

        return "admin/dong_sp/create";
    }
    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") DongSP dongSP, Model model){
        vm.loadFormEntyti(dongSP);
        model.addAttribute("dsp",vm);
        model.addAttribute("action","/admin/dongsp/update/"+dongSP.getId());
        return "admin/dong_sp/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") DongSP dongSP,
            @Valid @ModelAttribute("dsp") QLDongSP vm,
            BindingResult result,
            Model model
    ){
        if (result.hasErrors()){
            model.addAttribute("cv",vm);
            return "admin/dong_sp/create";
        }
        dongSP.loadFromVM(vm);
        this.dsprepo.save(dongSP);
        return "redirect:/admin/dongsp/index";

    }
    @PostMapping("store")
    public String store(@Valid @ModelAttribute("dsp") QLDongSP vm ,BindingResult result) {
        if (result.hasErrors()) {
            return "admin/dongsp/create";
        }

        DongSP dsp =new DongSP();
        dsp.loadFromVM(vm);
        this.dsprepo.save(dsp);

        return "redirect:/admin/dongsp/index";
    }
}
