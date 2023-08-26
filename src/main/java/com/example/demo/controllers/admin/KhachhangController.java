package com.example.demo.controllers.admin;


import com.example.demo.controllers.entities.ChucVu;
import com.example.demo.controllers.entities.KhachHang;
import com.example.demo.repositoris.KhachhangRepository;
import com.example.demo.view_model.QLChucVu;
import com.example.demo.view_model.QLKhachhang;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("admin/khach-hang")
public class KhachhangController {
    @Autowired
    private QLKhachhang vm;

    @Autowired
    private KhachhangRepository khrepo;


    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("ds", khrepo.findAll());
        return "admin/khach_hang/index";
    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("kh", vm);
        model.addAttribute("action", "/admin/khach-hang/store");
        return "admin/khach_hang/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("kh") QLKhachhang vm, BindingResult result) {
        if (result.hasErrors()) {
            return "admin/khach-hang/create";
        }

        KhachHang kh = new KhachHang();
        kh.loadFormVM(vm);
        this.khrepo.save(kh);

        return "redirect:/admin/khach-hang/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") KhachHang khachHang) {
        khrepo.delete(khachHang);
        return "redirect:/admin/khach-hang/index";


    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") KhachHang khachHang, Model model) {
        vm.loadFormEntyti(khachHang);
        model.addAttribute("kh", vm);
        model.addAttribute("action", "/admin/khach-hang/update/" + khachHang.getId());
        return "admin/khach_hang/create";
    }

    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") KhachHang khachHang,
            @Valid @ModelAttribute("cv") QLKhachhang vm,
            BindingResult result,
            Model model
    ) {
        if (result.hasErrors()) {
            model.addAttribute("kh", vm);
            return "admin/khach_hang/create";
        }
        khachHang.loadFormVM(vm);
        this.khrepo.save(khachHang);
        return "redirect:/admin/khach-hang/index";


    }
}
