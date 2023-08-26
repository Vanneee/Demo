package com.example.demo.controllers.admin;

import com.example.demo.view_model.QLNhanvien;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("admin/nhan-vien")
public class NhanvienController {
    private ArrayList list = new ArrayList();
    private NhanvienRepository nvrepo=new NhanvienRepository();
    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("ds", list );
        return "admin/nhan_vien/indexnv";

    }
    @GetMapping("create")
    public String create(Model model) {
        QLNhanvien nv =new QLNhanvien();

        model.addAttribute("nv",nv);

        return "admin/nhan_vien/createnv";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("nv") QLNhanvien nv , BindingResult result) {

        if (result.hasErrors()) {
            // Báo lỗi
            System.out.println(nv.getTen());

            return "admin/nhan_vien/createnv";
        } else {
            list.add(nv);
            //  return "admin/nhan_vien/createnv";
        }
                return "redirect:/admin/nhan-vien/index";
    }

    @GetMapping("delete/{ma}")
    public String delete(QLNhanvien nv){
  //      QLNhanvien qlNhanvien = new QLNhanvien();
      //  list.remove(nv);
        nvrepo.delete(nv);
        return "redirect:/admin/nhan-vien/index";


    }

}
