package org.jboss.weld.tests.beanDeployment.circular;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.container.test.api.ShouldThrowException;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.BeanArchive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class DependentSelfInjectionProducerTest {
    @Deployment
    // @ShouldThrowException(DefinitionException.class)
    @ShouldThrowException(Exception.class) // AS7-1197
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(BeanArchive.class)
                .addClasses(DependentLooping.class, DependentLoopingProducer.class);
    }

    @Test
    public void test() {

    }

}
