package com.lun.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Cnzlike
 * @date 2022/4/1 18:54
 */
@Component
public class MyLB implements LoadBalancer {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAngIncrement(){
        int current;
        int next;

        do {
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;  //当current >= 2147483647，current赋值为0，否则current赋值为current + 1
        }while (!this.atomicInteger.compareAndSet(current,next));
        //current是期望值，next是修改值。当atomicInteger和current相同时返回ture，并且修改atomicInteger为next，否则返回一个布尔值flase
        System.out.println("当前是第"+next+"次访问");
        return next;
    }
    //getAngIncrement方法实际上就是提供了一个从0到max递增的数，用来和服务实例总数取余 atomicInteger % serviceInstances
    //然后用这个余数作为索引来选择服务节点

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances)
    {
        int index = getAngIncrement() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
