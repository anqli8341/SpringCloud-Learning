package com.msa.openfeignconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.msa.commonapi.dto.Instance;

/**
 * @author anquan li
 */
@FeignClient("feign-service")
@RequestMapping("/feign-service")
public interface FeignServiceClient {
  @RequestMapping(value="/instance/{serviceId}",method = RequestMethod.GET)
  public Instance getInstanceByServiceId(@PathVariable("serviceId") String serviceId);
}
