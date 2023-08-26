package com.example.demo.controllers.admin;

import com.example.demo.controllers.entities.ChucVu;
import com.example.demo.controllers.entities.SanPham;
import com.example.demo.repositoris.ChucVurepository;
import com.example.demo.repositoris.SanPhamrepository;
import com.example.demo.view_model.QLChucVu;
import com.example.demo.view_model.QLSanPham;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("admin/san-pham")
public class SanPhamController {
    @Autowired
    private QLSanPham vm;

    @Autowired
    private SanPhamrepository sprepo;

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("ds",sprepo.findAll());
        return "admin/san_pham/index";

    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") SanPham sanPham)
    {
        this.sprepo.delete(sanPham);
        return "redirect:/admin/san-pham/index";
    }
    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("sp",vm);
        model.addAttribute("action", "/admin/san-pham/store");

        return "admin/san_pham/create";
    }
    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") SanPham sanPham, Model model){
        vm.loadFormEntyti(sanPham);
        model.addAttribute("sp",vm);
        model.addAttribute("action","/admin/san-pham/update/"+sanPham.getId());
        return "admin/san_pham/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") SanPham sanPham,
            @Valid @ModelAttribute("cv") QLSanPham vm,
            BindingResult result,
            Model model
    ){
        if (result.hasErrors()){
            model.addAttribute("sp",vm);
            return "admin/san_pham/create";
        }
        sanPham.loadFromVM(vm);
        this.sprepo.save(sanPham);
        return "redirect:/admin/san-pham/index";

    }
    @PostMapping("store")
    public String store(@Valid @ModelAttribute("sp") QLSanPham vm ,BindingResult result) {
        if (result.hasErrors()) {
            return "admin/san-pham/create";
        }

        SanPham sp = new SanPham();
        sp.loadFromVM(vm);
        this.sprepo.save(sp);

        return "redirect:/admin/san-pham/index";
    }
}
