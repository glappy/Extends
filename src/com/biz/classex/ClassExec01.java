package com.biz.classex;

import com.biz.classex.children.CatClass;
import com.biz.classex.children.DogClass;
import com.biz.classex.parents.AnimalClass;

public class ClassExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogClass dog = new DogClass();
		CatClass cat = new CatClass();
		
		AnimalClass animalClass = new AnimalClass();
		animalClass.strName = "포유류 동몰";
		animalClass.itsName();
		
		dog.strName = "몽탱이";
		dog.itsName();
		
		dog.strColor = "화이트";
		dog.itsColor();
		
		cat.strName = "나비";
		cat.itsName();
		


		
		
	}
}