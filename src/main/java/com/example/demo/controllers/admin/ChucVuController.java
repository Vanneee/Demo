package com.example.demo.controllers.admin;


import com.example.demo.controllers.entities.ChucVu;
import com.example.demo.repositoris.ChucVurepository;
import com.example.demo.view_model.QLChucVu;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("admin/chuc-vu")
public class ChucVuController {

    @Autowired
    private QLChucVu vm;

    @Autowired
    private ChucVurepository cvrepo;

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("ds",cvrepo.findAll());
        model.addAttribute("view","/views/admin/chuc_vu/index.jsp");
        return "layout";
       // return "admin/chuc_vu/index";

    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id")ChucVu chucVu)
    {
        this.cvrepo.delete(chucVu);
        return "redirect:/admin/chuc-vu/index";
    }
    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("cv",vm);
        model.addAttribute("action", "/admin/chuc-vu/store");
        model.addAttribute("view","/views/admin/chuc_vu/create.jsp");
        return "layout";
       // return "admin/chuc_vu/create";
    }
    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") ChucVu chucVu, Model model){
        vm.loadFormEntyti(chucVu);
        model.addAttribute("cv",vm);
        model.addAttribute("action","/admin/chuc-vu/update/"+chucVu.getId());
        model.addAttribute("view","/views/admin/chuc_vu/create.jsp");
        return "layout";
       // return "admin/chuc_vu/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") ChucVu chucVu,
            @Valid @ModelAttribute("cv") QLChucVu vm,
            BindingResult result,
            Model model
    ){
        if (result.hasErrors()){
            model.addAttribute("cv",vm);
            return "admin/chuc_vu/create";
        }
        chucVu.loadFromVM(vm);
        this.cvrepo.save(chucVu);
        return "redirect:/admin/chuc-vu/index";

    }
    @PostMapping("store")
    public String store(@Valid @ModelAttribute("ch") QLChucVu vm ,BindingResult result) {
        if (result.hasErrors()) {
            return "admin/chuc-vu/create";
        }

        ChucVu cv = new ChucVu();
        cv.loadFromVM(vm);
        this.cvrepo.save(cv);

        return "redirect:/admin/chuc-vu/index";
    }
}
