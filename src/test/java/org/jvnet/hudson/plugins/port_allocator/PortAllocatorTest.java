package org.jvnet.hudson.plugins.port_allocator;

import hudson.model.Descriptor;
import junit.framework.TestCase;

public class PortAllocatorTest extends TestCase {
    
    private PortAllocator portAllocator;
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        portAllocator = new PortAllocator("myportallocator");
        Pool pool = new Pool();
        pool.name = "mypool";
        pool.ports = "7001,7002";
        portAllocator.DESCRIPTOR.getPools().add(pool);
    }
    
    public void testAddAPool() throws Descriptor.FormException {
        //portAllocator.getDescriptor().configure(null, null);
    }
    
    public void testRemoveAPool() {
        
    }
    
    public void testChangeAPool() {
        
    }
}
