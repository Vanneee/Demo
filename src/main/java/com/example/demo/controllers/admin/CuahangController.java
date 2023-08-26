package com.example.demo.controllers.admin;


import com.example.demo.controllers.entities.CuaHang;
import com.example.demo.repositoris.CuaHangrepository;
import com.example.demo.view_model.QLCCuaHang;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;





@Controller
@RequestMapping("admin/cua-hang")
public class CuahangController {
    @Autowired
    private CuaHangrepository chrepo ;
    @Autowired
    private QLCCuaHang vm;
    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("ds", chrepo.findAll());
        model.addAttribute("view","/views/admin/cua_hang/index.jsp");
        return "layout";
     //   return "admin/cua_hang/index";

    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") CuaHang cuaHang)
    {
        this.chrepo.delete(cuaHang);
        return "redirect:/admin/cua-hang/index";
    }


    @GetMapping("create")
    public String create(Model model) {
    model.addAttribute("ch",vm);
        model.addAttribute("action", "/admin/cua-hang/store");
        model.addAttribute("view","/views/admin/cua_hang/create.jsp");
        return "layout";
   //     return "admin/cua_hang/create";
    }
    @GetMapping("edit/{id}")
    public String edit(
            @PathVariable("id") CuaHang cuaHang,
            Model model
    ) {
        vm.loadFromEntity(cuaHang);
        model.addAttribute("ch", vm);
        model.addAttribute("action", "/admin/cua-hang/update/" + cuaHang.getId());
        model.addAttribute("view","/views/admin/cua_hang/create.jsp");
        return "layout";
        //return "admin/cua_hang/create";
    }
    @PostMapping("update/{id}")
    public String update(
            @PathVariable("id") CuaHang cuaHang,
            @Valid QLCCuaHang vm,
            @ModelAttribute("ch")
            BindingResult result,
            Model model
    ) {
        if (result.hasErrors()){
            model.addAttribute("ch",vm);
            return "admin/cua_hang/create";
        }
        cuaHang.loadFromVM(vm);
        this.chrepo.save(cuaHang);
        return "redirect:/admin/cua-hang/index";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("ch") QLCCuaHang vm ,BindingResult result) {
        if (result.hasErrors()) {
            return "admin/cua_hang/create";
        }

        CuaHang ch = new CuaHang();
        ch.loadFromVM(vm);
        this.chrepo.save(ch);

        return "redirect:/admin/cua-hang/index";
    }
}
