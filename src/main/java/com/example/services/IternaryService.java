package com.example.services;

import java.util.List;


import com.example.entities.Iternary;

public interface IternaryService {
	
	Iternary addIternary(Iternary iternary);
	List<Iternary> getIternary();
    Iternary getIternaryById(int iternaryId);
//    Iternary getIternaryByDay(String Day);
    //Iternary updateIternary(Long iternaryId, Iternary iternary);
    void deleteIternary(int iternaryId);

}
