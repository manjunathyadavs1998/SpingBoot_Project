package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Country;
import com.example.demo.services.CountryService;

@RestController
@RequestMapping
public class CountryController {
	
	
	@Autowired
	CountryService countryservice;
	
	@GetMapping("/getcountries")
	public List getCountries()
	{
		return countryservice.getAllCountries();
	}
	
//	@GetMapping("/getcountries/{id}")
//	public Country getCountryById(@PathVariable(value="id"))
//	{
//		return countryservice.getCountrybyID(id);
//	}
	
	@GetMapping("/getcountries/{id}")
	public Country getCountryById(@PathVariable(value="id") int id)
	{
		return countryservice.getCountrybyID(id);
	}
	
	@GetMapping("/getcountries/countryname")
	public Country getCountryById(@RequestParam(value="name") String countryName)
	{
		return countryservice.getCountrybyName(countryName);
	}
	
	@PostMapping("/addcountry")
	public Country addCountry (@RequestBody Country country)
	{
		return countryservice.addCountry(country);
	}
	
	@PostMapping("/updatecountry")
	public Country updateCountry (@RequestBody Country country)
	{
		return countryservice.updateCountry(country);
	}
	
	@DeleteMapping("/deletecountry/{id}")
	public AddResponse deleteCountry(@PathVariable(value="id") int id)
	{
		return countryservice.deleteCountry(id);
	}
	
	
	
	
	
	
	

}
