package com.example.demo.controllers.admin;

import com.example.demo.controllers.entities.MauSac;
import com.example.demo.repositoris.MauSacrepository;
import com.example.demo.view_model.QLMauSac;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("admin/mau-sac")
public class MausacController {
    @Autowired
    private QLMauSac vm;

    @Autowired
    private MauSacrepository msrepo;

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("ds",msrepo.findAll());
        return "admin/mau_sac/index";

    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id")MauSac mauSac)
    {
        this.msrepo.delete(mauSac);
        return "redirect:/admin/mau-sac/index";
    }
    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("ms",vm);
        model.addAttribute("action", "/admin/mau-sac/store");

        return "admin/mau_sac/create";
    }
    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") MauSac mauSac, Model model){
        vm.loadFormEntyti(mauSac);
        model.addAttribute("ms",vm);
        model.addAttribute("action","/admin/mau-sac/update/"+mauSac.getId());
        return "admin/mau_sac/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") MauSac mauSac,
            @Valid @ModelAttribute("ms") QLMauSac vm,
            BindingResult result,
            Model model
    ){
        if (result.hasErrors()){
            model.addAttribute("ms",vm);
            return "admin/mau_sac/create";
        }
        mauSac.loadFromVM(vm);
        this.msrepo.save(mauSac);
        return "redirect:/admin/mau-sac/index";

    }
    @PostMapping("store")
    public String store(@Valid @ModelAttribute("ms") QLMauSac vm ,BindingResult result) {
        if (result.hasErrors()) {
            return "admin/mau-sac/create";
        }

        MauSac ms=new MauSac();
        ms.loadFromVM(vm);
        this.msrepo.save(ms);

        return "redirect:/admin/mau-sac/index";
    }
}
