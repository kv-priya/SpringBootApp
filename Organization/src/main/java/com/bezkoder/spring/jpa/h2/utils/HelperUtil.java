//package com.bezkoder.spring.jpa.h2.utils;
//
//
//import com.bezkoder.spring.jpa.h2.model.Employee;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Supplier;
//public class HelperUtil {
//
//    private HelperUtil() {
//    }
//
//
//
//
//
//	public static Supplier<List<Employee>> employeeSupplier = () -> {
//
//		Employee rahul = Employee.builder()
//				.id(1)
//				.firstName("Rahul")
//				.lastName("Ghadage")
//				.age(28)
//				.noOfChildrens(0)
//				.spouse(true)
//				.address(Address.builder()
//						.id(1)
//						.streetAddress("RS road")
//						.city("Pune")
//						.state("Maharashtra")
//						.country("India")
//						.postalCode("411018")
//						.build()
//				)
//				.hobbies(Arrays.asList("Coding", "Reading"))
//				.build();
//
//		PhoneNumber rahulsNo = PhoneNumber.builder()
//				.id(1)
//				.type("Mobile")
//				.number("1234567890")
//				.employee(rahul)
//				.build();
//
//		rahul.setPhoneNumbers(Arrays.asList(rahulsNo));
//
//
//
//
//
//
//		Employee aryan = Employee.builder()
//				.id(1)
//				.firstName("Aryan")
//				.lastName("Ghadage")
//				.age(28)
//				.noOfChildrens(0)
//				.spouse(true)
//				.address(Address.builder()
//						.id(1)
//						.streetAddress("A road")
//						.city("Pune")
//						.state("Maharashtra")
//						.country("India")
//						.postalCode("411018")
//						.build()
//				)
//				.hobbies(Arrays.asList("Dancing", "Cooking"))
//				.build();
//
//		PhoneNumber aryansNumber = PhoneNumber.builder()
//				.id(1)
//				.type("Mobile")
//				.number("1234555555")
//				.employee(aryan)
//				.build();
//
//		aryan.setPhoneNumbers(Arrays.asList(aryansNumber));
//
//
//		return Arrays.asList(rahul, aryan);
//	};
//}
