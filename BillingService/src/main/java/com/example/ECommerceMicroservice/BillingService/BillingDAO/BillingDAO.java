package com.example.ECommerceMicroservice.BillingService.BillingDAO;

import com.example.ECommerceMicroservice.BillingService.BillingModel.BillingModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingDAO extends CrudRepository<BillingModel,Integer> {
}
