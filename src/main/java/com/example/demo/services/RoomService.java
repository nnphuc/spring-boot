package com.example.demo.services;

import com.example.demo.models.DemoService;
import com.example.demo.models.Room;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomService {
    private final DemoService demoService;

    public RoomService(DemoService demoService) {
        this.demoService = demoService;
    }

    @RequestMapping(path = "/rooms", method = RequestMethod.GET)
    public List<Room> getRooms() {
        return demoService.getRooms();
    }
}
