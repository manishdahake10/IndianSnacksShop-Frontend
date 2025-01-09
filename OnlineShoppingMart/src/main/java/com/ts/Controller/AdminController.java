package com.ts.Controller;

import com.ts.DTO.ProductDTO;
import com.ts.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/products")
    public String getAllProducts(Model model) {
        model.addAttribute("products", adminService.getAllProducts());
        return "admin";
    }

    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute ProductDTO productDTO) {
        adminService.addProduct(productDTO);
        return "redirect:/admin/products";
    }

    @GetMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable Long id) {
        adminService.deleteProduct(id);
        return "redirect:/admin/products";
    }
}
