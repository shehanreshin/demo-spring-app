package edu.icet.controller;

import edu.icet.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;
    @GetMapping("/item")
    public String getItem() {
        return inventoryService.getItem();
    }
}
