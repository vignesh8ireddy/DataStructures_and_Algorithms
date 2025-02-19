package com.vignesh.rest;

import com.vignesh.service.IDCCExamples;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    IDCCExamples divideAndConquer;

    @GetMapping("/findminmax")

    public ResponseEntity<List<Integer>> findMinMax() {
        List<Integer> resList = divideAndConquer.findMinMax(List.of(8,-1,6,0,1,3,2));
        return new ResponseEntity<>(resList, HttpStatus.OK);
    }

}
