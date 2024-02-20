package com.example.demo;

import org.springframework.boot.autoconfigure.elasticsearch.ElasticsearchProperties.Restclient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanCheckController {
	
	
	
	
	@GetMapping("/loancheckbc/{cs}/{loanamt}/{salary}")
	public ResponseEntity<LoanResponse> checkLoanLimit(@PathVariable("cs") int cs,@PathVariable("loanamt")int loanamt,@PathVariable("salary")int salary){
		
		int approvedLoanAmt=0;
		String status="";
		
		if(loanamt<10000000) {
			approvedLoanAmt= 1000000;
			status="1";
		}else {
			
		}
		
		LoanResponse lr= new LoanResponse();	
	
		return ResponseEntity.ok(lr);
	}
	
	
	/*
	 * @GetMapping("posts/id") public ResponseEntity<PostResponse>
	 * getPostTest(@PathVariable("id") String id) {
	 * 
	 * String uri="https://jsonplaceholder.typicode.com/posts"; PostResponse pr=
	 * Restclient.create().get().uri(uri+"/posts"+id).retrive().body(PostResponse.
	 * class);
	 * 
	 * 
	 * return ResponseEntity.ok(pr); }
	 */


}
