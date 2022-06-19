package com.example.demo.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DemoService {
    private final RoomRepository roomRepository;
    private final EmployeeRepository employeeRepository;

    public DemoService(RoomRepository roomRepository, EmployeeRepository employeeRepository) {
        this.roomRepository = roomRepository;
        this.employeeRepository = employeeRepository;
    }

    public List<Room> getRooms() {
        List<Room> rooms = new ArrayList<>();
        Iterable<Room> roomIterable = this.roomRepository.findAll();
        roomIterable.forEach(r -> rooms.add(r));
        return rooms;
    }

    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        Iterable<Employee> iterable = employeeRepository.findAll();
        iterable.forEach(e -> employees.add(e));
        return employees;
    }
}
