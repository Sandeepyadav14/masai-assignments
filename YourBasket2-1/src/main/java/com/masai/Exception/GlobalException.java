package com.masai.Exception;

import java.time.LocalDateTime;

import javax.persistence.RollbackException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;



@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(Exception.class)
    public ResponseEntity<MyErrorDetails> myIllegalHandler(Exception ie, WebRequest req){
        MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),ie.getMessage(), req.getDescription(false));
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<MyErrorDetails> mynotFoundHandler(NoHandlerFoundException nfe, WebRequest req) {
        MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }
	
	@ExceptionHandler(RollbackException.class)
    public ResponseEntity<MyErrorDetails> rollbackException(RollbackException nfe, WebRequest req) {
        MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }

	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> mynotFoundHandler(MethodArgumentNotValidException nfe, WebRequest req) {
		MyErrorDetails err=new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setDetails("Validation Error...");
		err.setMessage(nfe.getBindingResult().getFieldError().getDefaultMessage());
        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }
	
	
	
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> myUserException(UserException ee,WebRequest wr){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),ee.getMessage(), wr.getDescription(false));
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(CustomerException.class)
	public ResponseEntity<MyErrorDetails> myCustomerException(CustomerException ee,WebRequest wr){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),ee.getMessage(), wr.getDescription(false));
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AdminException.class)
	public ResponseEntity<MyErrorDetails> myAdminException(AdminException ee,WebRequest wr){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),ee.getMessage(), wr.getDescription(false));
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(CartException.class)
	public ResponseEntity<MyErrorDetails> myCartException(CartException ee,WebRequest wr){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),ee.getMessage(), wr.getDescription(false));
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(FeedBackException.class)
	public ResponseEntity<MyErrorDetails> myFeedBackException(FeedBackException ee,WebRequest wr){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),ee.getMessage(), wr.getDescription(false));
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}
   
	
	@ExceptionHandler(VegetableException.class)
	public ResponseEntity<MyErrorDetails> myVegetablestException(VegetableException ee,WebRequest wr){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),ee.getMessage(), wr.getDescription(false));
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(BillDetailsException.class)
	public ResponseEntity<MyErrorDetails> myBillingDetailsException(BillDetailsException ee,WebRequest wr){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),ee.getMessage(), wr.getDescription(false));
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(OrdersException.class)
	public ResponseEntity<MyErrorDetails> myOrdersException(OrdersException ee,WebRequest wr){
		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),ee.getMessage(), wr.getDescription(false));
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
	}
	
	

	@ExceptionHandler(CredentialException.class)
	public ResponseEntity<MyErrorDetails> credentialExceptionHandler(CredentialException ie, WebRequest req){
		
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
		
	}
	
	
	
}
