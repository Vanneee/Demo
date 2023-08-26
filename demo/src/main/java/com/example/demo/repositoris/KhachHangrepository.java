package com.example.demo.repositoris;

import com.example.demo.view_model.QLKhachhang;
import com.example.demo.view_model.QLNhanvien;

import java.util.ArrayList;

public class KhachHangrepository {
    private ArrayList<QLKhachhang> list;
    public KhachHangrepository(){
        list =new ArrayList<>();
    }
    public void insert(QLKhachhang qlnv){
        this.list.add(qlnv);
    }
    public ArrayList<QLKhachhang> findAll()
    {
        return this.list;
    }

    public void delete(QLKhachhang kh)
    {
        for (int i = 0; i < this.list.size(); i++) {
            QLKhachhang vm = this.list.get(i);
            if (vm.getMa().equals(kh.getMa())) {
                this.list.remove(i);
            }
        }
    }
    public QLKhachhang findByMa(String ma)
    {
        // SELECT * FROM KhachHang WHERE ma = ?
        for (int i = 0; i < this.list.size(); i++) {
            QLKhachhang vm = this.list.get(i);
            if (vm.getMa().equals(ma)) {
                return this.list.get(i);
            }
        }

        return null;
    }
    public void update(QLKhachhang qlkh)
    {
        // UPDATE KhachHang SET ... WHERE ma = ?
        for (int i = 0; i < this.list.size(); i++) {
            QLKhachhang vm = this.list.get(i);
            if (vm.getMa().equals(qlkh.getMa())) {
                this.list.set(i, qlkh);
            }
        }
    }

}
