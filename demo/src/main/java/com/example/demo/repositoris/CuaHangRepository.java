package com.example.demo.repositoris;

import com.example.demo.view_model.QLCCuaHang;

import java.util.ArrayList;

public class CuaHangRepository {
private ArrayList<QLCCuaHang> list;
public CuaHangRepository(){
    this.list=new ArrayList<>();
}
public void insert(QLCCuaHang qlch){
    this.list.add(qlch);
}
    public ArrayList<QLCCuaHang> findAll()
    {
        return this.list;
    }
    public void delete(QLCCuaHang qlch)
    {
        for (int i = 0; i < this.list.size(); i++) {
            QLCCuaHang vm = this.list.get(i);
            if (vm.getMa().equals(qlch.getMa())) {
                this.list.remove(i);
            }
        }
    }
}
