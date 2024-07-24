package com.tnsif.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Javastreamdemo {
	public static void main(String[] args) {
		List <Product> pl=new ArrayList<Product>();
		pl.add(new Product(1,"Asus ",700000));
		pl.add(new Product(1,"Dell ",600000));
		pl.add(new Product(1,"hp ",500000));
	//	List<Float> pl2=pl.stream().filter(p->p.price>300000)//filtering the data
    //    .map(p->p.price)
     //   .collect(Collectors.toList());
		//System.out.println(pl2);
		//using collectors method to sum of the price
		//double totalprice=pl.stream().collect(Collectors.summarizingDouble(Prodct->Product.price));
	//	System.out.println(totalprice);
		//find max and min
		Product p=pl.stream().max((Product1,Product2)->Product1.price>Product2.price?1:-1).get();
		System.out.println(p.price);


	}

}
