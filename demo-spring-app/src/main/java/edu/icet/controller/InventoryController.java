package edu.icet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    @GetMapping("/item")
    public String getItem() {
        return "Item";
    }
}
