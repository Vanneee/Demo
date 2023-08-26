package com.example.demo.controllers.admin;

import com.example.demo.controllers.entities.*;
import com.example.demo.repositoris.*;
import com.example.demo.view_model.QLChitietsp;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("admin/ctsp")
public class ChitietSPController {
    @Autowired
    private ChiTietSPrepository ctsprepo;

    @Autowired
    private SanPhamrepository sprepo;
    @Autowired
    private MauSacrepository msrepo;
    @Autowired
    private DongSPrepository dsprepo;
    @Autowired
    private NSXrepository nsxrepo;
    @Autowired
    private QLChitietsp vm;

    @GetMapping("index")
    public String index(Model model) {
        // List<NhanVien> ds = nvrepo.findAll();
        model.addAttribute("dsctsp", ctsprepo.findAll());
        model.addAttribute("view","/views/admin/chi_tietsp/index.jsp");
        return "layout";
     //   return "admin/chi_tietsp/index";

    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("ctsp", vm);
        model.addAttribute("action", "/admin/ctsp/store");
        model.addAttribute("dssp", sprepo.findAll());
        model.addAttribute("dsms", msrepo.findAll());
        model.addAttribute("dsdsp", dsprepo.findAll());
        model.addAttribute("dsnsx", nsxrepo.findAll());
        model.addAttribute("view","/views/admin/chi_tietsp/create.jsp");
        return "layout";
       // return "admin/chi_tietsp/create";
    }

    @PostMapping("store")
    public String store(Model model, @Valid @ModelAttribute("ctsp") QLChitietsp vm, BindingResult result) {
        if (result.hasErrors()) {
            model.addAttribute("dssp", sprepo.findAll());
            model.addAttribute("dsms", msrepo.findAll());
            model.addAttribute("dsdsp", dsprepo.findAll());
            model.addAttribute("dsnsx", nsxrepo.findAll());
            return "admin/chi_tietsp/create";
        }
        ChiTietSP ctsp = new ChiTietSP();
        ctsp.loadFormVM(vm);
        SanPham sanPham = this.sprepo.findById(vm.getSanPham()).get();
        ctsp.setSp(sanPham);
        NSX nsx = this.nsxrepo.findById(vm.getNSX()).get();
        ctsp.setNsx(nsx);
        DongSP dongSP = this.dsprepo.findById(vm.getDongSP()).get();
        ctsp.setDongSP(dongSP);
        MauSac mauSac = this.msrepo.findById(vm.getMS()).get();
        ctsp.setMs(mauSac);
        this.ctsprepo.save(ctsp);
        return "redirect:/admin/ctsp/index";
    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") ChiTietSP ctsp) {

        this.ctsprepo.delete(ctsp);
        return "redirect:/admin/ctsp/index";


    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") ChiTietSP ctsp,
                       Model model){
        vm.loadEntity(ctsp);
        model.addAttribute("ctsp", vm);
        model.addAttribute("action", "/admin/ctsp/update/"+ctsp.getId());
        model.addAttribute("dssp", sprepo.findAll());
        model.addAttribute("dsms", msrepo.findAll());
        model.addAttribute("dsdsp", dsprepo.findAll());
        model.addAttribute("dsnsx", nsxrepo.findAll());
        model.addAttribute("view","/views/admin/chi_tietsp/create.jsp");
        return "layout";
       // return  "admin/chi_tietsp/create";
    }

    @PostMapping("update/{id}")

    public String update( @PathVariable("id") ChiTietSP ctsp,
                          @Valid
                          @ModelAttribute("ctsp")QLChitietsp vm,
                                      BindingResult result,
                          Model model

    ){
        if (result.hasErrors()) {
            model.addAttribute("ctsp",vm);
//            model.addAttribute("dssp", sprepo.findAll());
//            model.addAttribute("dsms", msrepo.findAll());
//            model.addAttribute("dsdsp", dsprepo.findAll());
//            model.addAttribute("dsnsx", nsxrepo.findAll());
            return "admin/chi_tietsp/create";
        }
        ctsp.loadFormVM(vm);
        SanPham sanPham = this.sprepo.findById(vm.getSanPham()).get();
        ctsp.setSp(sanPham);
        NSX nsx = this.nsxrepo.findById(vm.getNSX()).get();
        ctsp.setNsx(nsx);
        DongSP dongSP = this.dsprepo.findById(vm.getDongSP()).get();
        ctsp.setDongSP(dongSP);
        MauSac mauSac = this.msrepo.findById(vm.getMS()).get();
        ctsp.setMs(mauSac);
        this.ctsprepo.save(ctsp);
        return "redirect:/admin/ctsp/index";
    }


}
