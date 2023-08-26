package com.example.demo.controllers.confix;

import com.example.demo.view_model.QLCCuaHang;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

public class DemoBeanConfig {
    @Bean("vm1")
    public QLCCuaHang getCuaHangVM1()
    {
        QLCCuaHang vm = new QLCCuaHang();
        vm.setMa("CH01");
        vm.setTen("Cua hang 1");
        return vm;
    }

    @Bean("vm2")
    public QLCCuaHang getCuaHangVM2()
    {
        QLCCuaHang vm = new QLCCuaHang();
        vm.setMa("CH02");
        vm.setTen("Cua hang 2");
        return vm;
    }
}
