package com.pace.collections.list;

import java.util.ArrayList;

public class TechListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>techList=new ArrayList<String>();
		techList.add("java");
		techList.add("react");
		techList.add("Dot net");
		System.out.println("original tech list: ");
		for(String technology:techList) {
			System.out.println(technology);
		}
		String langStr="react";
		techList.set(2,langStr);
		System.out.println("Tech list after Updation");
		for(String technology:techList) {
			System.out.println(technology);
		}
		techList.remove("react");
		System.out.println("Tech list after deletion");
		for(String technology:techList) {
			System.out.println(technology);
		}
	}

}
