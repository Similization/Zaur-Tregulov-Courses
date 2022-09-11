package com.simis.spring.mvc;

import com.simis.spring.mvc.validation.EmailAnnotation;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 3, message = "Min length is 3 symbols")
    private String name;
    @NotBlank(message = "this field is required")
//    @NotNull
    private String surname;
    private String department;
    private final Map<String, String> departments;
    @Min(value = 14, message = "You are too young for this shit")
    @Max(value = 65, message = "Common, just go and relax, stop working")
    private int age;
    private String car;
    private final Map<String, String> cars;
    private String[] languages;
    private final Map<String, String> allLanguages;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "expected number like xxx-xx-xx")
    private String phoneNumber;
    @EmailAnnotation
    private String email;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information technologies");
        departments.put("HR", "Human resources");
        departments.put("Savers", "Savers");

        cars = new HashMap<>();
        cars.put("BMW", "BMW");
        cars.put("MB", "Mercedes Benz");
        cars.put("LA", "Lamborghini");

        allLanguages = new HashMap<>();
        allLanguages.put("ENG", "English");
        allLanguages.put("RUS", "Russian");
        allLanguages.put("FRA", "France");
        allLanguages.put("GER", "German");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getAllLanguages() {
        return allLanguages;
    }

    public String getDepartment() {
        return department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public int getAge() {
        return age;
    }

    public String getCar() {
        return car;
    }

    public Map<String, String> getCars() {
        return cars;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
