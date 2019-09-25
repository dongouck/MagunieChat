package com.myspace.magunies;

public class BbsManager {

	public String bbsrNumbering(int bbsId, int bbsrOrder) {
		
		int LengthOfBbsId = (int)(Math.log10(bbsId)+1);
		int LengthOfBbsrOrder = (int)(Math.log10(bbsrOrder)+1);
		
		String StringbbsId=Integer.toString(bbsId);
		String StringbbsrOrder=Integer.toString(bbsId);
		
		if(LengthOfBbsId==1) {
			  StringbbsId="00"+StringbbsId;
			  
			  }else if(LengthOfBbsId==2) {
				  StringbbsId="0"+StringbbsId;
				  
		}
		if(LengthOfBbsrOrder==1) {
			StringbbsrOrder="00"+bbsrOrder;
			
			}else if(LengthOfBbsrOrder==2) {
				StringbbsrOrder="0"+bbsrOrder;
			
		}
		  String bbsrId=StringbbsId+StringbbsrOrder;
		  
		  return bbsrId;
	}
	
}
