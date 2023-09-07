package com.example.rentingsystem.Controller;

import com.example.rentingsystem.Api.ApiResponse;
import com.example.rentingsystem.DTOs.RenterDTO;
import com.example.rentingsystem.Service.RenterService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/renters")
@RequiredArgsConstructor
public class RenterController {
    private final RenterService renterService;

    @GetMapping("/get")
    public ResponseEntity getRenters(){
        return ResponseEntity.status(200).body(renterService.getRenters());
    }

    @PutMapping("/update")
    public ResponseEntity updateRenter(@RequestBody @Valid RenterDTO renterDTO){
        renterService.updateRenter(renterDTO);
        return ResponseEntity.status(200).body(new ApiResponse("updated !"));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteRenter(@PathVariable Integer id){
        renterService.deleteRenter(id);
        return ResponseEntity.status(200).body(new ApiResponse("Deleted"));
    }

}