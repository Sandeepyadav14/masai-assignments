package query;

import dao.Querydao;
import dao.Querydaoimpl;

public class Bonus {
	public static void main(String[] args ) {
		Querydao qd=new Querydaoimpl();
	    int d=qd.ProvideAllBonus();
	    if(d>0) {
	    	System.out.println("yes");
	    }
	}

}
