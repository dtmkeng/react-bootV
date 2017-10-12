package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class MakeRentController {

    @Autowired
    RentBillRepository rentBillRepository;
    @Autowired
    MusicalInstrumentRepository musicalInstrumentRepository;
    @ResponseBody
    @RequestMapping(path = "/RentBill/{id}/musical/{musical}/rentdate/{rentdate}/returndate/{returndate}/price/{temp}", method = RequestMethod.GET)
    public String rentbill(@PathVariable String id,@PathVariable Long musical,@PathVariable String rentdate,@PathVariable String returndate,@PathVariable String temp) {
        MusicalInstrument musicalInstrument = this.musicalInstrumentRepository.findOne(musical);
        RentBill  rentbill = new RentBill(musicalInstrument,id,rentdate,returndate,temp);
        this.rentBillRepository.save(rentbill);
        return "{\"status\":\"Voted\"}";
    }
}