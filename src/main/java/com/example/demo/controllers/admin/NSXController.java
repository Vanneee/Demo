package com.example.demo.controllers.admin;

import com.example.demo.controllers.entities.ChucVu;
import com.example.demo.controllers.entities.NSX;
import com.example.demo.repositoris.ChucVurepository;
import com.example.demo.repositoris.NSXrepository;
import com.example.demo.view_model.QLChucVu;
import com.example.demo.view_model.QLNSX;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("admin/nsx")
public class NSXController {
    @Autowired
    private QLNSX vm;

    @Autowired
    private NSXrepository nsxrepo;

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("ds",nsxrepo.findAll());
        return "admin/nsx/index";

    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") NSX nsx)
    {
        this.nsxrepo.delete(nsx);
        return "redirect:/admin/nsx/index";
    }
    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("nsx",vm);
        model.addAttribute("action", "/admin/nsx/store");

        return "admin/nsx/create";
    }
    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") NSX nsx, Model model){
        vm.loadFormEntyti(nsx);
        model.addAttribute("nsx",vm);
        model.addAttribute("action","/admin/nsx/update/"+nsx.getId());
        return "admin/nsx/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") NSX nsx,
            @Valid @ModelAttribute("nsx") QLNSX vm,
            BindingResult result,
            Model model
    ){
        if (result.hasErrors()){
            model.addAttribute("nsx",vm);
            return "admin/nsx/create";
        }
        nsx.loadFromVM(vm);
        this.nsxrepo.save(nsx);
        return "redirect:/admin/nsx/index";

    }
    @PostMapping("store")
    public String store(@Valid @ModelAttribute("ch") QLNSX vm ,BindingResult result) {
        if (result.hasErrors()) {
            return "admin/nsx/create";
        }

        NSX nsx = new NSX();
        nsx.loadFromVM(vm);
        this.nsxrepo.save(nsx);

        return "redirect:/admin/nsx/index";
    }
}
