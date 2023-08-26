package com.example.demo.controllers.admin;


import com.example.demo.view_model.QLKhachhang;

import com.example.demo.view_model.QLNhanvien;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("admin/khach-hang")
public class KhachhangController {
private ArrayList<QLKhachhang> list = new ArrayList<>();
    private KhachHangrepository khrepo =new KhachHangrepository();

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("ds",khrepo.findAll());
        return  "admin/khach_hang/index";
    }
    @GetMapping("create")
    public String create(Model model) {
        QLKhachhang kh =new QLKhachhang();

        model.addAttribute("kh",kh);

        return "admin/khach_hang/create";
    }
    @PostMapping("store")
    public String store(@Valid @ModelAttribute("kh") QLKhachhang kh , BindingResult result) {

        if (result.hasErrors()) {
            // Báo lỗi
            System.out.println(kh.getTen());

            return "admin/khach_hang/create";
        } else {
            khrepo.insert(kh);
            //  return "admin/nhan_vien/createnv";
        }
        return "redirect:/admin/khach-hang/index";
    }
    @GetMapping("delete/{ma}")
    public String delete(QLKhachhang kh){
        khrepo.delete(kh);
        //  //      list.remove(kh);
        return "redirect:/admin/khach-hang/index";


    }
//    @PostMapping("update/{ma}")
//    public String update(QLKhachhang kh){
//       // lits.set(Integer.parseInt("ma"),qlNhanVien);
//        return "redirect:/NhanVien/index";
//    }
//
//    @GetMapping("edit/{ma}")
//    public String getEdit(QLKhachhang kh,Model model){
//
//        model.addAttribute("kh",khrepo.findAll());
//        return "/NhanVien/index";
//    }
    @GetMapping("edit/{ma}")
    public String getFormEdit(Model model, @PathVariable String ma){
        QLKhachhang kh = new QLKhachhang();
        for(int i = 0; i <list.size(); i++){
            if(list.get(i).getMa().equalsIgnoreCase(ma)){
                kh = list.get(i);
            }
        }
        model.addAttribute("kh", kh);
        return "admin/khach-hang/edit";
    }

    @PostMapping("edit/update/{ma}")
    public String update(@Valid @ModelAttribute("kh") QLKhachhang kh, BindingResult result){
        if(result.hasErrors()){
            return "admin/khach-hang/update";
        }
        for(int i = 0; i <list.size(); i++){
            if(list.get(i).getMa().equals(kh.getMa())){
                list.set(i, kh);
            }
        }
        return "redirect:/admin/khach-hang/index";
    }
}
