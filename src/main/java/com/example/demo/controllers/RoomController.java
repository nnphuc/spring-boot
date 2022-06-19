package com.example.demo.controllers;

import com.example.demo.models.DemoService;
import com.example.demo.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private final DemoService demoService;

    public RoomController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping
    public String getRooms(Model model) {
        List<Room> rooms = demoService.getRooms();
        model.addAttribute("rooms", rooms);
        return "rooms";
    }
}
