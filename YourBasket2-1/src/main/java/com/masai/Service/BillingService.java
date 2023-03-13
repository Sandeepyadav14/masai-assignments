package com.masai.Service;

import com.masai.Exception.*;
import com.masai.module.BillDetails;

public interface BillingService {

    public BillDetails addBill(BillDetails bill,String key) throws BillDetailsException;
    public BillDetails updateBill(BillDetails bill,String key) throws BillDetailsException;
    public BillDetails viewBill(Integer id) throws  BillDetailsException;
}
