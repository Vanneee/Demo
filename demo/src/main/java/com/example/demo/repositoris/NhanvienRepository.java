package com.example.demo.repositoris;


import com.example.demo.view_model.QLCCuaHang;
import com.example.demo.view_model.QLNhanvien;

import java.util.ArrayList;

public class NhanvienRepository {
private ArrayList<QLNhanvien> list;
public NhanvienRepository(){
    list =new ArrayList<>();
}
    public void insert(QLNhanvien qlnv){
        this.list.add(qlnv);
    }
    public ArrayList<QLNhanvien> findAll()
    {
        return this.list;
    }

    public void delete(QLNhanvien nv)
    {
        for (int i = 0; i < this.list.size(); i++) {
            QLNhanvien vm = this.list.get(i);
            if (vm.getMa().equals(nv.getMa())) {
                this.list.remove(i);
            }
        }
    }
}