package com.example.demo.controllers.admin;


import com.example.demo.view_model.QLCCuaHang;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("admin/cua-hang")
public class CuahangController {
    @Autowired
    private QLCCuaHang ch;
    private CuaHangRepository chrepo = new CuaHangRepository();

    @GetMapping("index")
    public String index(Model model) {
//        this.chrepo = new CuaHangRepository();
//        ArrayList<QLCCuaHang> list = this.chrepo.findAll();
//       // model.addAttribute("list", list);
//        model.addAttribute("ds", list);
//
//        chrepo.insert(new QLCCuaHang("1","1","3","4","HH"));
//        chrepo.insert(new QLCCuaHang("1", "2", "3", "4","hh"));

        model.addAttribute("ds", chrepo.findAll());
        return "admin/cua_hang/index";

    }


    @GetMapping("create")
    public String create(Model model) {
  //  QLCCuaHang ch =new QLCCuaHang();

    model.addAttribute("ch",ch);

        return "admin/cua_hang/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("ch") QLCCuaHang ch ,BindingResult result) {
    //chrepo.insert(ch);
        return "admin/cua_hang/create";
      //  return "redirect:/admin/cua-hang/index";
    }
}
//    @GetMapping("delete/{ma}")
//    public String delete(@PathVariable("ma") QLCCuaHang ch)
//    {
//}
