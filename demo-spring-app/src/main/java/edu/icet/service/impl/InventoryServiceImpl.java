package edu.icet.service.impl;

import edu.icet.service.InventoryService;
import org.springframework.stereotype.Service;

@Service
public class InventoryServiceImpl implements InventoryService {
    @Override
    public String getItem() {
        return "Item";
    }
}
